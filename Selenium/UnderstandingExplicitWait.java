package seleniumDemoMain;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UnderstandingExplicitWait {

	public static void main(String[] args) {
		
		//launch browser
		WebDriver driver=  new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading");
		
		//Decalaration of explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//click on link1
		WebElement element1 = driver.findElement(By.partialLinkText("Example 1:"));
		element1.click();
		
	
		//locate and click start button
		driver.findElement(By.cssSelector("#start>button")).click();
		
		//Using dynamic wait
		//WebElement hellotext =wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish>h4")));
		WebElement hellotext =wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#finish>h4")));
		System.out.println(hellotext.getText());
		
		//navigate to the previous page
		driver.navigate().back();
		
		//locate and click on link2
		WebElement element2 = driver.findElement(By.xpath("//a[contains(text(),'Example 2:')]"));
		element2.click();
		
		//locate and click start button
		driver.findElement(By.cssSelector("#start>button")).click();
		
		//Usage of Dynamic wait	
		//Element is in dom but added dynamically
		WebElement helloText = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='finish']/h4")));
		System.out.println(helloText.getText());
		
		
		
		
		
		
		

	}

}
