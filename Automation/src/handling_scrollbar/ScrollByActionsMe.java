package handling_scrollbar;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByActionsMe {
	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		WebDriver driver = new ChromeDriver();
		// to call the method
		scrollByActionsMe(driver);
	}

	public static void scrollByActionsMe(WebDriver driver) throws InterruptedException {
		// to maximize the browser
		driver.manage().window().maximize();
		// to syncronisation
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url
		driver.get("https://www.bbc.com/");
		// to create an object of Actions class
		Actions a = new Actions(driver);
		// to call the method
		a.scrollByAmount(0,3000).perform();
		// to wait 
		Thread.sleep(4000);
		// to close
		driver.quit();
	}
}
