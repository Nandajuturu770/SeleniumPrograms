/* HiddenDivision Or CalenderPopup :
 * we can inspect this popup
 * we cannot move this popup
 */

package handling_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionOrCalenderPopup {
	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to call the method
		hiddenDivisionOrCalenderPopup(dr);
	}

	public static void hiddenDivisionOrCalenderPopup(WebDriver dr) throws InterruptedException {
		// to maximize the browser
		dr.manage().window().maximize();
		// to synchronization
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url
		dr.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		// to find the element 
		dr.findElement(By.xpath("//span[@role='button']")).click();
		// to close the browser
		dr.quit();
	}
}
