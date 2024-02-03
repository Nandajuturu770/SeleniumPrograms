
/* to check whether the selenium.org url is navigating to selenium.dev url */

package webelement_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyingNavigatingUrl {
	
	public static void main(String[] args) throws InterruptedException {
		// to open browser and pass the reference variable
		WebDriver d = new ChromeDriver();
		verifyingNavigatingUrl(d);
		WebDriver d1 = new EdgeDriver();
		verifyingNavigatingUrl(d1);
		WebDriver d2 = new FirefoxDriver();
		verifyingNavigatingUrl(d2);
	}

	public static void verifyingNavigatingUrl(WebDriver d ) throws InterruptedException {
		// to wait 
		Thread.sleep(2000);
		// to maximize the web page 
		d.manage().window().maximize();
		Thread.sleep(2000);
		// to enter url 
		d.get("https://www.seleniumhq.org/");
		Thread.sleep(2000);
		// to get current url of web page 
		String currentUrl = d.getCurrentUrl();
		Thread.sleep(2000);
		// to check and print the result of output 
		if(currentUrl.equals("https://www.selenium.dev/"))
			System.out.println("url is navigating successfully and pass");
		else
			System.out.println("url is \"not\" navigating successfully and fail");
		Thread.sleep(2000);
		// to close 
		d.quit();
	}

}
