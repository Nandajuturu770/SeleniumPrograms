package handling_windows;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWithoutQuit {

	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		WebDriver driver =new ChromeDriver();
		// to call the method
		closeWithoutQuit(driver);
	}
	public static void closeWithoutQuit(WebDriver driver) throws InterruptedException {
		// to maximize the window 
		driver.manage().window().maximize();
		// to sycronization 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url
		driver.get("https://secure.indeed.com/");
		// to find the element and click on it
		driver.findElement(By.id("login-google-button")).click();
		// to find the element and click on it
		driver.findElement(By.id("apple-signin-button")).click();
		// to get all the window hangles of browser
		Set<String> Allwh = driver.getWindowHandles();
		// to get all the window handles
		for(String wh :Allwh) {
			// to wait for some seconds
			Thread.sleep(2000);
			// to switch the window 
			driver.switchTo().window(wh);
			// to print the title of the browser
			System.out.println(driver.getTitle());
			// to close the window
			driver.close();
		}
	}
}
