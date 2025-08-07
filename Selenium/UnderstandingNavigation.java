package seleniumDemoMain;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class UnderstandingNavigation {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().fullscreen();
		
		
		//driver.get("https://www.google.com");
		String url1="https://www.google.com";
		//URL url1 = new URL("https://www.google.com");
		//Loads the page
		//accepts the only strings or string obj
		//will not accept url obj
		driver.get(url1);
		Thread.sleep(3000);
		
		//get title of the page
		System.out.println(driver.getTitle());
		
		//driver.navigate().to("https://www.youtube.com");
		//String url ="https://www.youtube.com";
		URL url = new URL("https://www.youtube.com");
		
		//Loads the page
		//accepts the  strings or string obj
		//will  accept url obj
		driver.navigate().to(url);
		Thread.sleep(3000);
		
		//Prints the title of the page
		System.out.println(driver.getTitle());
		
		//back to the page
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		//navigates forward to the page
		driver.navigate().forward();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		//refreshes the current page
		driver.navigate().refresh();
		Thread.sleep(3000);
		
//		
//		// Using get()
//        long startGet = System.currentTimeMillis();
//        driver.get("https://www.wikipedia.org");
//        long endGet = System.currentTimeMillis();
//        System.out.println("Time taken using get(): " + (endGet - startGet) + "ms");
//
//        Thread.sleep(2000);  // Just for observation
//
//        // Using navigate().to()
//        long startNav = System.currentTimeMillis();
//        driver.navigate().to("https://www.wikipedia.org");
//        long endNav = System.currentTimeMillis();
//        System.out.println("Time taken using navigate().to(): " + (endNav - startNav) + "ms");

		
		//closes the session
        driver.quit();
		
	}

}
