
/* to maximize and minimize the browser page */

package webelement_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToMimimizeWebPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		// to maximize the browser page
		d.manage().window().maximize();
		// to wait 
		Thread.sleep(2000);
        // to enter url 
		d.get("https://www.gmail.com/");
		// to wait for get title 
		Thread.sleep(2000);
		// to get title 
		String name = d.getTitle();
		// to print on console 
		System.out.println(name);
		// ===> to minimize the browser page 
		d.manage().window().minimize();
		// to close the browser 
		d.close(); // or d.quit();
	}

}
