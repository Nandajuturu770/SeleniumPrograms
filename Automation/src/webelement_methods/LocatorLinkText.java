
/* get locators by using linkText method and partialLinkText method */

package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorLinkText {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();	
		locatorLinkText(driver);
		WebDriver driver1 = new FirefoxDriver();
		locatorLinkText(driver1);
		
	}

	public static void locatorLinkText(WebDriver driver) throws InterruptedException {

		// to maximize the page
		driver.manage().window().maximize();
		// to wait 
		Thread.sleep(2000);
		//to enter url
		driver.get("file:///D:/fireflink/all%20is%20well.html");
		Thread.sleep(2000);
		// by using linkText method 
		driver.findElement(By.linkText("MY BROWSER")).click();
		Thread.sleep(2000);
		// get title
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		// to goto back
		driver.navigate().back();
		Thread.sleep(2000);
		// by using partialLinkText
		driver.findElement(By.partialLinkText("BROWSER")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		// to close
		driver.quit();
	    
	}

}
