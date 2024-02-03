
/* TO COPY FROM ONE TEXT FIELD AND PASTE IT IN ANOTHER TEXT FIELD */

package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyAndPaste {

	public static void main(String[] args) throws InterruptedException {
		// open browser
		WebDriver dr = new ChromeDriver();
		copyAndPast(dr);
	}

	public static void copyAndPast(WebDriver dr) throws InterruptedException {
		// to maximize 
		dr.manage().window().maximize();
		// to sleep 
		Thread.sleep(2000);
		// to enter url
		dr.get("https://demo.opensourcebilling.org/");
		// to find element and pass keys 
		dr.findElement(By.id("email")).sendKeys(Keys.CONTROL+"ac");
		Thread.sleep(2000);
		dr.findElement(By.id("password")).sendKeys(Keys.CONTROL+"av");
		Thread.sleep(2000);
		// to sleep
		dr.quit();
	}

}
