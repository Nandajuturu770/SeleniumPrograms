
/* TO HANDLING THE MULTIPLE ELEMENTS WITH HELP OF "findElements()" METHOD */

package handling_mutli_elements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultiElements {
	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		handlingMultiElements(dr);
	}

	public static void handlingMultiElements(WebDriver dr) throws InterruptedException {
		// to maximize
		dr.manage().window().maximize();
		// to sleep 
		Thread.sleep(2000);
		// to enter url
		dr.get("file:///D:/fireflink/all%20is%20well.html");
		Thread.sleep(2000);
		// to find the element
		List<WebElement> elements = dr.findElements(By.xpath("//a"));
		// size of list 
		int size = elements.size();
		System.out.println(size);
		for(int i = 0 ; i < size ; i++ ) {
			System.out.println(elements.get(i).getText());
		}
		// to close 
		dr.quit();
	}
}
