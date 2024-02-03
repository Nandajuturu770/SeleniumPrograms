package handling_scrollbar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByActionsMe1 {
	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to call the method
		scrollByActionsMe1(dr);
	}

	public static void scrollByActionsMe1(WebDriver dr) throws InterruptedException {
		// to maximize the browsee
		dr.manage().window().maximize();
		// to syncronization
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url
		dr.get("https://www.bbc.com/");
		// to create of actions class object
		Actions a = new Actions(dr);
		// to find the element
		WebElement we = dr.findElement(By.xpath(" //a[text()=' Podcasts ']"));
		// to call the method
		a.scrollToElement(we).perform();
		// to wait
		Thread.sleep(2000);
		// to close the browser
		dr.quit();
	}
}
