/*EXPLICIT WAIT STATEMENT IS USED HANDLE THE ALL THE METHODS OD SCRIPT 
 * ==> BUT ONE SCRIPT ONLY ONE AT A TIME HANDLE 
 * ++ by using urlContains() method
 */

package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitByUrlContains {
	public static void main(String[] args) {
		// to open the browser
		ChromeDriver dr = new ChromeDriver();
		// to call the method	
		explicitWaitByUrlContains(dr);
	}

	public static void explicitWaitByUrlContains(ChromeDriver dr) {
		// to maximize
		dr.manage().window().maximize();
		// to enter url
		dr.get("https://chat.qspiders.com/");
		// to find the element on web page and enter the input into it
		dr.findElement(By.name("username")).sendKeys("nandajuturu@gmail.com");
		dr.findElement(By.name("password")).sendKeys("Nandajuturu#770");
		// to click on the login button
		dr.findElement(By.xpath("//button[.='Login']")).submit();
		// to create an object Explict wail
		WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(10));
		// to call the until method from the WebDriveWait
		wait.until(ExpectedConditions.urlContains("student"));
		// to print the url 
		System.out.println(dr.getCurrentUrl());
		// to click on logout
		dr.findElement(By.xpath("//button[.='logout']")).click();
		// to confirm the okay
		dr.findElement(By.xpath("//button[text() = 'Ok']")).click();
		// to close the browser 
		dr.quit();	
	}
}
