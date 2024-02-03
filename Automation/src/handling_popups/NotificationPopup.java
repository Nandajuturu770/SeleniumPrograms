/* TO HANDLE THE NOTIFICATION POPUP */
package handling_popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	public static void main(String[] args) throws InterruptedException {
		// to pass the setting to the browser
		ChromeOptions co = new ChromeOptions();
		// to add the argument
		co.addArguments("--disable-notifications");
		// to open the browser
		WebDriver dr = new ChromeDriver(co);
		// to maximize
		dr.manage().window().maximize();
		// to enter the url
		dr.get("https://www.yatra.com/");
		// to wait
		Thread.sleep(2000);
		// to close
		dr.quit();
	}
}
