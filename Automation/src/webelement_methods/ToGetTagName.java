
/* "to print the tag name of element" */

package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToGetTagName {
	public static void toGetTagName(WebDriver dr) throws InterruptedException {
		// to maximize 
		dr.manage().window().maximize();
		// to sleep 
		Thread.sleep(2000);
		// to enter url 
		dr.get("https://www.facebook.com/");
		Thread.sleep(2000);
		// to find the element
		/* gertTagName() : 
		 * which is used to get the tag name of the particular element 
		 */
		String st = dr.findElement(By.xpath("//a[.='Forgotten password?']")).getTagName();
		System.out.println(st);
		// to close the browser
		dr.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		// to open the browser 
		WebDriver dr1 = new ChromeDriver();
		System.out.println("FROM THE CHROME ");
		toGetTagName(dr1);
		System.out.println("FROM THE FIRE FOX");
		WebDriver dr2 = new FirefoxDriver();
		toGetTagName(dr2);

	}
}
