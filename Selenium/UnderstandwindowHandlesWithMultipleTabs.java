package seleniumDemoMain;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandwindowHandlesWithMultipleTabs {

	public static void main(String[] args) throws InterruptedException {
		
		//Launching the browser
		WebDriver driver= new ChromeDriver();
				
		//Navigate to the url
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
				
		//Create JavaScriptExecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
				
		//locate the new tab button
		WebElement tabBtn= driver.findElement(By.xpath("//button[@id='tabButton']"));
		js.executeScript("arguments[0].scrollIntoView(true)",tabBtn ); //scroll to button
		Thread.sleep(2000);
		tabBtn.click();
		Thread.sleep(2000);
		tabBtn.click();
		Thread.sleep(2000);		
		
		//locate the window button
		WebElement windowBtn= driver.findElement(By.xpath("//button[@id='windowButton']"));
		js.executeScript("arguments[0].scrollIntoView(true)",windowBtn ); //scroll to button
		Thread.sleep(2000);
		windowBtn.click();
		Thread.sleep(2000);
		windowBtn.click();
		Thread.sleep(2000);
		
		//Getting handle of current window
		String currentHandle = driver.getWindowHandle();
				
		//Creating set that contains handles all the windows opened
		Set<String>handles = driver.getWindowHandles();
		System.out.println(handles);
		System.out.println(handles.size());
				
		//creating iterator
		Iterator<String>it=handles.iterator();
				
	
		//Loop through the handles set
		for(String handle:handles )
		{
			//check each handle is not the current handle on which the driver is pointing
			if(!currentHandle.equals(handle))
			{
				driver.switchTo().window(handle);
				
				//wait
				Thread.sleep(2000);
				
				//Get the txt in the new tab/window
				String newTabTxt = driver.findElement(By.tagName("h1")).getText();
				System.out.println(newTabTxt);
				
				//wait
				Thread.sleep(2000);
				
				//close the window /tab that the driver is pointing to
				driver.close();
			}
			else
			{
				//if it's  the main handle		
				driver.switchTo().window(it.next());
			
			}
			
			
		}
		
		//Switch to parent handle
		driver.switchTo().window(currentHandle);
		
		//close
		driver.close();
		

	}

}
