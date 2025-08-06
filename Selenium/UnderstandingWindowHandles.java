package seleniumDemoMain;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UnderstandingWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Launching the browser
		WebDriver driver= new ChromeDriver();
		
		//Navigate to the url
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		
		//Create JavaScriptExecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//locate the button
		WebElement tabBtn= driver.findElement(By.xpath("//button[@id='tabButton']"));
		js.executeScript("arguments[0].scrollIntoView(true)",tabBtn ); //scroll to button
		Thread.sleep(2000);
		tabBtn.click();
		Thread.sleep(2000);
		
		//Getting the window handle of the current tab
		//Window handles are basically unique id associated with each window
		String currentHandle = driver.getWindowHandle();
		
		//Set of window handles of all opened tab
		Set<String>handles= driver.getWindowHandles();
		
		//Print handles
		System.out.println(handles);
		
		//set won't store the handles in the order of  opened window
		//Iterator points to the first handle in the list
		Iterator<String>it=handles.iterator();
		String nextHandle= it.next();
		
		
		//comparing if the current handle is same as the first handle in the set
		//If it's not equal, switch to the nexthandle, which is the handle of new tab
		if(!currentHandle.equals(nextHandle))
		{
			driver.switchTo().window(nextHandle);
		}
		else
		{
			//If it's  equal, then move the iterator to next handle in the set and switch to the new window
			driver.switchTo().window(it.next());
		}
		
		//wait
		Thread.sleep(2000);
		
		//Get the txt in the new tab
		String newTabTxt = driver.findElement(By.tagName("h1")).getText();
		System.out.println(newTabTxt);
		
		//wait
		Thread.sleep(2000);
		
		//will close the new tab, since the driver has been switched to the new tab
		//It won't hold any thing in past
		driver.close();
		
		//wait
		Thread.sleep(2000);
		
		//It will throw exception
		//since the driver is pointing to the child
		//since child is closed, the driver doesn't find any tab to close
		//so to avoid it we need to switch back to the old window
		
		
		//wait
		Thread.sleep(2000);
		
		//Switch back to old window
		driver.switchTo().window(currentHandle);
		
		//close the browser
		//driver.close();
		
		//quit close the session
		driver.quit();
		
		
	}

}
