package seleniumDemoMain;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingWindowHandleForNewWindow {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Launching the browser
		WebDriver driver= new ChromeDriver();
		
		
		//Navigate to the url
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		
		//Create JavaScriptExecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//locate the button
		WebElement windowBtn= driver.findElement(By.xpath("//button[@id='windowButton']"));
		js.executeScript("arguments[0].scrollIntoView(true)",windowBtn ); //scroll to button
		Thread.sleep(2000);
		windowBtn.click();
		Thread.sleep(2000);
		
		//Getting handle of current window
		String currentHandle = driver.getWindowHandle();
		
		//Creating set that contains handles all the windows opened
		Set<String>handles = driver.getWindowHandles();
		
		//creating iterator
		Iterator<String>it=handles.iterator();
		
		//First handle in the set
		String nextHandle = it.next();
		
		
		//comparing if the current handle is same as the first handle in the set
				
		if(!currentHandle.equals(nextHandle))
		{
			driver.switchTo().window(nextHandle);
		}
		else
		{
					
			driver.switchTo().window(it.next());
		
		}

		//wait
		Thread.sleep(2000);
				
		//Get the txt in the new tab
		String newTabTxt = driver.findElement(By.tagName("h1")).getText();
		System.out.println(newTabTxt);
				
		//wait
		Thread.sleep(2000);
		
		//close
		driver.close();
		
		//wait
		Thread.sleep(2000);
		
		//Switch back to old window
		driver.switchTo().window(currentHandle);
				
		//close the browser
		driver.close();
				
		
	}

}
