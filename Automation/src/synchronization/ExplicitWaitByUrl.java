/*EXPLICIT WAIT STATEMENT IS USED HANDLE THE ALL THE METHODS OD SCRIPT 
 * ==> BUT ONE SCRIPT ONLY ONE AT A TIME HANDLE 
 * ++ by using urlToBe() method*/

package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitByUrl {
	public static void main(String[] args) {
		// to enter url 
		WebDriver dr = new ChromeDriver();
		// to call the method
		explicitWaitByUrl(dr);	
	}

	public static void explicitWaitByUrl(WebDriver dr) {	
		dr.manage().window().maximize();
		// to enter url
		dr.get("https://chat.qspiders.com/");
		// to find the element on web page and enter the input into it
		dr.findElement(By.name("username")).sendKeys("nandajuturu@gmail.com");
		dr.findElement(By.name("password")).sendKeys("Nandajuturu#770");
		// to click on the login button
		dr.findElement(By.xpath("//button[.='Login']")).submit();
		/* to use explicit wait steps we have to do 
		 * --> 1. create an object for WebDriverWait type 
		 * --> 2. and pass parameter of constructor with WebDriver and Duration types
		 * --> 3. in it we have until method (non static method) and call the method with reference of reference
		 * --> 4. pass parameter of ExpectedConditions
		 */
		WebDriverWait wait = new WebDriverWait(dr,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe("https://chat.qspiders.com/student-dashboard"));
		// to print the current url 
		System.out.println(dr.getCurrentUrl());
		// to click on logout
		dr.findElement(By.xpath("//button[.='logout']")).click();
		// to confirm the okay
		dr.findElement(By.xpath("//button[text() = 'Ok']")).click();
		// to close the browser 
		dr.quit();		
	}
}
