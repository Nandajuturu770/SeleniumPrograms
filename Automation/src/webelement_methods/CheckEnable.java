
/* to check whether the button is enabled or not by using isEnabled() method of web element interface*/

package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckEnable {

	public static void main(String[] args) throws InterruptedException {
		// to open browser
		WebDriver drive = new ChromeDriver();
		checkEnable(drive);
	}
	public static void checkEnable(WebDriver dr ) throws InterruptedException {
		// to sleep 
		Thread.sleep(2000);
		// to maximize 
		dr.manage().window().maximize();
		Thread.sleep(2000);
		// to enter url
		dr.get("https://www.facebook.com/");
		Thread.sleep(2000);
		// to find the element
		/* isEnabled() : 
		 * which is used to check whether the button is enabled or not 
		 * it will return the boolean value */
		boolean n = dr.findElement(By.xpath("//button[@name='login']")).isEnabled();
		Thread.sleep(2000);
		// to display the result according to out put of boolean value
		if (n == true)
			System.out.println(" the login button is enable \" passed \"");
		else
			System.out.println(" the login button is \"not\" enabled \"failed\"");
		// to close the browser 
		dr.quit();

	}
}