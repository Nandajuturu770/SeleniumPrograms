
/* to maximize the web page */

package webelement_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaxWebPage {

	public static void main(String[] args) throws InterruptedException {
		// to open browser
		WebDriver driver = new ChromeDriver();
		// to wait  
		Thread.sleep(2000);
		// to maximize the browser page 
		driver.manage().window().maximize();
		// to enter url 
		driver.get("https://www.gmail.com/");
		//to wait for to get title of the web page
		Thread.sleep(2000);
		// to get title from web page 
		String title = driver.getTitle();
		// to print the title of web page on console 
		System.out.println(title);
		// to close all the web pages including parent web page and child web pages 
		driver.quit();
	}

}
