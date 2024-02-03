/* TO HANDLE ANTHENTICATION POPUP */
package handling_popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {
	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to maximize
		dr.manage().window().maximize();
		// to enter the url and pass data
		dr.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		// to wait
		Thread.sleep(2000);
		// to close
		dr.quit();
	}
}
