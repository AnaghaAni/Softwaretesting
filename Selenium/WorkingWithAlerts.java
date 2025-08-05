package seleniumDemoMain;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Launch Chrome Browser
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		 // Creating a JavaScriptExecutor reference to scroll into view
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		// Explicit wait
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//Simple Alert
		WebElement simpleAlertBtn = driver.findElement(By.id("alertButton"));
		js.executeScript("arguments[0].scrollIntoView(true)", simpleAlertBtn); // Scroll to the simple alert button
		simpleAlertBtn.click();
		Thread.sleep(2000);
		
		// Switch to the simple alert and accept it (click OK)
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		
		
		//Confirmation Alert Button
		WebElement confrimAlertBtn = driver.findElement(By.cssSelector("#confirmButton"));
		confrimAlertBtn.click();
		Thread.sleep(2000);
		
		// Switch to the confirmation alert and dismiss (click Cancel)
		Alert confirmationAlert = driver.switchTo().alert();
		// Switch to the confirmation alert and accept (click ok)
		//confirmationAlert.accept();
		confirmationAlert.dismiss();
		Thread.sleep(2000);
		
		// Read the result text after alert action
		WebElement confirmRes =driver.findElement(By.id("confirmResult"));
		String confirmRestxt = confirmRes.getText();
		
		// Validate the result of the confirmation alert
		if(confirmRestxt.contains("Ok"))
			System.out.println("Clicked Ok button");
		else 
			System.out.println("Clicked Cancel button");
		
		//Timer Alert Button
		WebElement  timerAlertBtn =driver.findElement(By.id("timerAlertButton"));
		timerAlertBtn.click();
		Thread.sleep(1000);
		
		 // Wait until the alert is present
		wait.until(ExpectedConditions.alertIsPresent());
		
		 // Switch to the alert and accept it
		Alert timerAlert = driver.switchTo().alert();
		timerAlert.accept();
		
		//Prompt Alert
		WebElement promptAlertBtn = driver.findElement(By.id("promtButton"));
		promptAlertBtn.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.alertIsPresent());
		
		// Switch to the alert, send text, and accept
		Alert promptAlert = driver.switchTo().alert();
		String inputResult="Anagha Anil Kumar";
		promptAlert.sendKeys(inputResult);
		Thread.sleep(2000);
		promptAlert.accept();
		
		// Read the result text after alert action
		WebElement promptRes = driver.findElement(By.cssSelector("#promptResult"));
		String promptTxt=promptRes.getText();
		
		// Validate the result of the Prompt alert
		if( promptTxt.contains(inputResult))
			System.out.println("Prompt text validated successfully "+inputResult);
		else 
			System.out.println("Validation failed");
		
		
		//close browser
		driver.quit();
		
		
			

	}

}
