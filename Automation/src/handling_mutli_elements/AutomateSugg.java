
/* TO GET AUTO SUGGESTIONS OF FLIFKACT APPLICATION BY USING findElements() METHOD*/

package handling_mutli_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateSugg {
	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to the method
		automateSugg(dr);
	}
	public static void automateSugg(WebDriver dr ) throws InterruptedException {
		// to maximize 
		dr.manage().window().maximize();
		// to sleep
		Thread.sleep(2000);
		// to enter url 
		dr.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		dr.findElement(By.xpath("//span[contains(text(),'✕')]")).click();
		// to find the element on web page and enter send keys
		dr.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(2000);
		List<WebElement> link = dr.findElements(By.xpath("//span[contains(text(),'iphone')]/.."));
		// to print the size of list or count 
		System.out.println(link.size());
		// to get all text of Suggestions 
		for (WebElement webElement : link) {
			System.out.println(webElement.getText());
			
		}
		// to click on last link on suggestions
		link.get(link.size()-1).click();
		// to close the browser
		dr.quit();
		
	}
	
}
