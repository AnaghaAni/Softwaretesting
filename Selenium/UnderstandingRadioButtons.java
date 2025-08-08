package seleniumDemoMain;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingRadioButtons {
public static void main(String[] args) throws InterruptedException 
	{
		
		//launch browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");// navigates to the url
		Thread.sleep(2000); //wait
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//create obj of javaScriptExecutor
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		//1. Locate male radio btn
		WebElement maleRadio = driver.findElement(By.id("male"));
		
		// Check if the 'Male' radio button is already selected before clicking
		System.out.println("Male Radio is selected: "+maleRadio.isSelected());
		
		// Click the 'Male' radio button to select it
		maleRadio.click();
		
		// Verify again if the 'Male' radio button is now selected
		System.out.println("Male Radio is selected: "+maleRadio.isSelected());
		
		
		//2. Locate Female radio btn
		WebElement FemaleRadio = driver.findElement(By.id("female"));
				
		// Check if the 'Female' radio button is already selected before clicking
		System.out.println("Female Radio is selected: "+FemaleRadio.isSelected());
				
		// Click the 'Female' radio button to select it
		FemaleRadio.click();
				
		// Verify again if the 'Female' radio button is now selected
		System.out.println("Female Radio is selected: "+FemaleRadio.isSelected());
		
		//find all radio buttons with the same name
		List<WebElement>radioList=driver.findElements(By.name("gender"));
		for(WebElement radio:radioList)
		{
			String radioTxt=radio.getAttribute("value");
			if(radioTxt.equals("male"))
			{
				radio.click();
				System.out.println(" Radio is selected: "+radio.isSelected());
				System.out.println(" Radio is selected: "+radioTxt);
				
			}
		}
		
		
	}

}
