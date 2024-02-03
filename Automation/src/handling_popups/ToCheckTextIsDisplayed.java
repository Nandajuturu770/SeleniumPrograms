/* 
 * TO CHECK THE POPUR MESSAGE IS DISPLAYED OR NOT AFTER CLICK ON CANCEL BUTTON ON POPUP
 */
package handling_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToCheckTextIsDisplayed {
	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to call the method
		toCheckTextIsDisplayed(dr);
	}

	public static void toCheckTextIsDisplayed(WebDriver dr) throws InterruptedException {
		// to maximize the browser
		dr.manage().window().maximize();
		// to synchronization
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url
		dr.get("https://demo.automationtesting.in/Alerts.html");	
		// to find the element and click on it
		dr.findElement(By.xpath("//a[.='Alert with OK & Cancel ']")).click();
		// to wait 
		dr.findElement(By.xpath("//button[.='click the button to display a confirm box ' ]")).click();
		// to wait utill to popup is present
		WebDriverWait w = new WebDriverWait(dr, Duration.ofSeconds(10));
		// explicit condition
		w.until(ExpectedConditions.alertIsPresent());
		// to wait
		Thread.sleep(2000);
		// to switch to popup
		dr.switchTo().alert().dismiss();
		// to verify text is displayed or not 
		boolean b = dr.findElement(By.id("demo")).isDisplayed();
		if(b==true)
			System.out.println("THE TEXT IS DISPLAYED AND \"PASS\" ");
		else
			System.out.println("THE TEXT IS NOY DISPLAYED AND \"FAIL\" ");
		// to close the browser
		dr.quit();
		}

}
