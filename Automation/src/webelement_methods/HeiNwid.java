
/* to find the height and width of element with help of 
 * ==> getSize() , getHeight() and getWidth() */

package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeiNwid {
	public static void main(String[] args) throws InterruptedException {
		// to open browser
		WebDriver dr1 = new FirefoxDriver(); 
		WebDriver dr2 = new ChromeDriver();
		// method calling statements 
		heiNwid(dr1);
		heiNwid(dr2);
	}
	public static void heiNwid(WebDriver dr ) throws InterruptedException {
		// to sleep
		Thread.sleep(2000);
		// to maximize
		dr.manage().window().maximize();
		// to enter url
		dr.get("https://www.instagram.com/");
		Thread.sleep(2000);
		// to find element in web page
		// to get height and width of user name text box 
		WebElement e1 = dr.findElement(By.name("username"));
		Thread.sleep(2000);
		int h1 = e1.getSize().getHeight();
		int w1 = e1.getSize().getWidth();
		// to find the element of password text box
		WebElement e2 = dr.findElement(By.name("password"));
		Thread.sleep(2000);
		// to get height and width of the pass word text box
		int h2 = e2.getSize().getHeight();
		int w2 = e2.getSize().getWidth();
		if(h1==h2 && w1==w2)
			System.out.println("un and pw text box are same \"PASSED\"");
		else
			System.out.println("un and pw text box are same \"FAILED\"");
		// to close 
		dr.quit();
	}

}
