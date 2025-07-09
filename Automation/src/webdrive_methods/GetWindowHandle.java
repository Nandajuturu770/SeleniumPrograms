
/* to get address of the window (curren window or browser)*/

package webdrive_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static WebDriver driver;

	public static void main(String[] args) {
		// to open the browser
		driver = new ChromeDriver();
		// to enter the url
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println(getParentWindowId());
		// to close 
		driver.quit();
	}

	/**
	 * @description this method is used to get window id of parent.
	 * @return widowId <code>String</code>
	 */
	public static String getParentWindowId() {
		return driver.getWindowHandle();
	}
}
