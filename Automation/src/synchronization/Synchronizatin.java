/* 
 * SYNCHRONIZATION : THE PROCESS OF MACHING THE SPEED OF SELENIUM WITH APPICATION 
 */
package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronizatin {
	public static void main(String[] args) throws InterruptedException {

		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to calling statement 
		synchronization(dr);

	}

	public static void synchronization(WebDriver dr) throws InterruptedException {

		// to maximize
		dr.manage().window().maximize();
		// to wait 
		Thread.sleep(2000);
		// to enter url
		dr.get("https://chat.qspiders.com/");
		Thread.sleep(2000);
		// to find the element on web page and enter the input into it
		dr.findElement(By.name("username")).sendKeys("nandajuturu@gmail.com");
		Thread.sleep(2000);
		dr.findElement(By.name("password")).sendKeys("Nandajuturu#770");
		Thread.sleep(2000);
		// to click on the login button
		dr.findElement(By.xpath("//button[.='Login']")).submit();
		Thread.sleep(2000);
		// to click on logout
		dr.findElement(By.xpath("//button[.='logout']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//button[text() = 'Ok']")).click();
		// to close the browser
		dr.quit();

	}
}

