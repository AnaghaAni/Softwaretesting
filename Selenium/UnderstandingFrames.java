package seleniumDemoMain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingFrames {

	public static void main(String[] args) {
	
		
		//Launches Browser 
		WebDriver driver = new ChromeDriver();
//		driver.get("https://demoqa.com/frames");

		
		
//		driver.switchTo().frame("frame1");
//		WebElement frameElement = driver.findElement(By.tagName("body"));
//		String  frameTxt = frameElement.getText();
//		System.out.println(frameTxt);

		//open the webpage
		driver.get("https://demoqa.com/nestedframes");
		
		//Switch to the parent frame
		driver.switchTo().frame("frame1"); //Since we have id we can pass, it as a parameter in frame()
		WebElement parentframe = driver.findElement(By.tagName("body"));
		String  parentTxt = parentframe.getText();
		System.out.println(parentTxt);
		
		//Switch to child frame
		//Since no id in iframe , create xpath for srcdoc sttribute
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		
		//now pass this  webelemant to  frame()
		driver.switchTo().frame(frame2);
		WebElement childframe = driver.findElement(By.tagName("body"));
		String  childTxt = childframe.getText(); //obtain the visible text
		System.out.println(childTxt); 
		
	}

}
