/*ALERT POPUP or CONFIRMATION POPUP: 
 * we cannot move this type of popups
 * we cannot inspect this type of popups  
 * we contains 'ok' button
 * it will present at middle of window page and bottom of the address bar*/
package handling_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlertPopup {
	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to call the method
		handlingAlertPopup(dr);
	}

	public static void handlingAlertPopup(WebDriver dr) throws InterruptedException {
		// to maximize the browser
		dr.manage().window().maximize();
		// to synchronization
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url
		dr.get("https://demo.automationtesting.in/Alerts.html");
		// to find the element 
		dr.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		// to wait utill the popup is displayed
		WebDriverWait w = new WebDriverWait(dr, Duration.ofSeconds(10));
		w.until(ExpectedConditions.alertIsPresent());
		// to wait
		Thread.sleep(2000);
		// to switch to alert popup
		Alert a = dr.switchTo().alert();
		// to get text of alert popup
		System.out.println(a.getText());
		// to click on okay button
		a.accept();
		// to close the browser
		dr.close();

	}
}
