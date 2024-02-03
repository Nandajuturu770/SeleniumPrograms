package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWait {
	public static void main(String[] args) throws InterruptedException {
		// to open browser
		WebDriver dr = new FirefoxDriver();
		// to calling statement
		implicitWait(dr);
	}

	public static void implicitWait(WebDriver dr) throws InterruptedException {
		// to maximize the browser
		dr.manage().window().maximize();
		// to implicitly wait
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter url
		dr.get("https://chat.qspiders.com/");
		// to find the element on web page and enter the input into it
		dr.findElement(By.name("username")).sendKeys("nandajuturu@gmail.com");
		dr.findElement(By.name("password")).sendKeys("Nandajuturu#770");
		// to click on the login button
		dr.findElement(By.xpath("//button[.='Login']")).submit();
		// to wait
		Thread.sleep(3000);
		//to get current url
		System.out.println(dr.getCurrentUrl());
		// to click on logout
		dr.findElement(By.xpath("//button[.='logout']")).click();
		// to confirm the okay
		dr.findElement(By.xpath("//button[text() = 'Ok']")).click();
		// to get title
		System.out.println(dr.getTitle());
		// to close the browser
		dr.quit();
	}
}
