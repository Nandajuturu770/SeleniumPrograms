package handling_mouse_actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutUsingFE {
	public static void main(String[] args) {
		// to open the browser
		WebDriver dr =new ChromeDriver();
		// to call the method 
		withoutUsingFE(dr);
	}
	public static void withoutUsingFE(WebDriver dr) {
		// to maximize the browser
		dr.manage().window().maximize();
		// to syncronization
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url
		dr.get("https://www.google.com/");
		// to send the data into element which active on webpage
		dr.switchTo().activeElement().sendKeys("java");
		// to find the element 
		List<WebElement> allEl = dr.findElements(By.xpath("//span[contains(text(),'java')]/.."));
		System.out.println(allEl.size());
		for (WebElement we : allEl) {
			System.out.println(we.getText());
		}
		// to close the browser
		dr.quit();
	}
}
