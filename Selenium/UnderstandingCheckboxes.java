package seleniumDemoMain;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		//launch browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");// navigates to the url
		Thread.sleep(2000); //wait
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//create obj of javaScriptExecutor
		JavascriptExecutor js =(JavascriptExecutor) driver;
			
	
		
	// 1️. Locate the Sunday checkbox using CSS Selector by ID
		WebElement sundayCheck = driver.findElement(By.cssSelector("#sunday"));

		// Scroll Sunday checkbox into view
		js.executeScript("arguments[0].scrollIntoView(true)", sundayCheck);
		Thread.sleep(2000);

		// Check if Sunday checkbox is already selected
		System.out.println("Checkbox is selected: " + sundayCheck.isSelected());

	// 2️. Click on the Sunday checkbox
		sundayCheck.click();
		Thread.sleep(2000);

		// Check if it is now selected
		System.out.println("Checkbox is selected: " + sundayCheck.isSelected());

		// Print the 'value' attribute of the checkbox
		System.out.println(sundayCheck.getAttribute("value"));

	// 3️. Deselect the Sunday checkbox
		Thread.sleep(2000);
		sundayCheck.click();
		Thread.sleep(2000);
		

	}

}
