package seleniumDemoMain;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingWindowHandles1 {

	public static void main(String[] args) {
		
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//loads the page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String title = driver.getTitle();
		
		//locate OrangeHRM, Inc link and click 
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		//locate linkdin icon and click
		driver.findElement(By.xpath("//a[contains(@href,'https://www.linkedin.com/company/orangehrm/mycompany/')]")).click();
		
		
		//locate facebook icon and click
		driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/OrangeHRM/')]")).click();
		
		//locate twitter
		driver.findElement(By.cssSelector("a[href='https://twitter.com/orangehrm?lang=en']")).click();
		
		//locate Youtube icon and click
		driver.findElement(By.cssSelector("a[href='https://www.youtube.com/c/OrangeHRMInc']")).click();
		
//		Method-1
		
		
//		Set<String>handles=driver.getWindowHandles();
//		
//		for(String handle:handles)
//		{
//			String titleWnd = driver.switchTo().window(handle).getTitle();
//			if(!titleWnd.equals(title))
//			{
//				System.out.println(driver.getCurrentUrl());
//				WebElement h1Txt=driver.findElement(By.tagName("h1"));
//				System.out.println(h1Txt.getText());
//				
//			}
//				
//		}
		
//		Method 2
		
		//Get main page window handle
		String mainHandle = driver.getWindowHandle();
		
				
		//get all the windowIds
		Set<String>windowHandles = driver.getWindowHandles(); 
		//Iterator to iterator over set
		Iterator <String> it = windowHandles.iterator();
		
		//Print Title of current page
		System.out.println(driver.getTitle());
		
		//Iterating window handle
		for(String handle: windowHandles)
		{
			
			if(!mainHandle.equals(handle))
			{
				 driver.switchTo().window(handle);
				 String eachWindTitle = driver.getTitle();
				 System.out.println(eachWindTitle);
			}
			else
			{
				driver.switchTo().window(it.next());
			
			}
			
			//get the title of new page

			String txt =driver.getTitle();
			
			//if the page current newpage's title match with the desired title,then perform the action
			if(txt.contains("YouTube"))
			{
				WebElement searchtxt =driver.findElement(By.cssSelector(".ytSearchboxComponentInput"));
				searchtxt.sendKeys("selenium");
				System.out.println(searchtxt.getAttribute("value"));
				searchtxt.sendKeys(Keys.ENTER);
				System.out.println(searchtxt.getAttribute("value"));
			}
				
		}
		
		

	}

}
