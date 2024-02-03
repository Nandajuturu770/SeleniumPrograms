/* to get the all adress of the browser or windows */
package webdrive_methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to maximize 
		dr.manage().window().maximize();
		// to enter the url 
		dr.get("https://secure.indeed.com/");
		// to find the element and click on the element
		dr.findElement(By.id("login-google-button")).click();
		// to find the elemet and click on the element
		dr.findElement(By.id("apple-signin-button")).click();
		// to wait 
		Thread.sleep(2000);
		// to get the address of all windows or browsers
		Set<String> whs = dr.getWindowHandles();
		// to print 
		for (String wh : whs) {
			System.out.println(wh);
		}	 
		dr.quit();
	}
}
