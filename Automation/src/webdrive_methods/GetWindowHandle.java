/* to get address of the window (curren window or browser)*/

package webdrive_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	
public static void main(String[] args) {
	// to open the browser
	WebDriver dr = new ChromeDriver();
	// to enter the url
	dr.get("https://www.amazon.in/");
	dr.manage().window().maximize();
	// to get address the browser and store
	String wh = dr.getWindowHandle();
	// to print
	System.out.println(wh);
	// to close 
	dr.quit();
	}
}
