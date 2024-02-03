
/* to check whether the google.com url is navigating to account.google.com url */

package webelement_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyingGoogleUrlNavigating {
	
	public static void main(String[] args) throws InterruptedException {
		// to open the browsers and pass the reference variable to method
		WebDriver d = new ChromeDriver();
		verifyingGoogleUrlNavigating(d);
		WebDriver d1 = new FirefoxDriver();
		verifyingGoogleUrlNavigating(d1);
		WebDriver d2 = new EdgeDriver();
		verifyingGoogleUrlNavigating(d2);
	}

	public static void verifyingGoogleUrlNavigating (WebDriver d ) throws InterruptedException {
		// to maximize 
		d.manage().window().maximize();
		// to wait 
		Thread.sleep(2000);
		// to enter url 
		d.get("https://www.gmail.com/");
		// to get current url 
		String cUrl = d.getCurrentUrl();
		// to check 
		if(cUrl.contains("https://www.account.google.com/"))
			System.out.println("url is navigating successfully and pass");
		else
			System.out.println("url is \"not\" navigating successfully and fail");
		// to close 
		d.quit();
	}

}
