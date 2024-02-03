
/* TO CLICK ALL THE CHECK BOXS ON WEB PAGE WITH HELP OF findElements() METHOD */

package handling_mutli_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckboxs {

	public static void main(String[] args) throws InterruptedException {
		// to open browser
		WebDriver dr = new ChromeDriver();
		// to call the method
		selectAllCheckboxs(dr);
	}

	public static void selectAllCheckboxs(WebDriver dr) throws InterruptedException {
		
		// to maximize
		dr.manage().window().maximize();
		// to sleep
		Thread.sleep(2000);
		// to enter url 
		dr.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		// to find the element on web page 
		dr.findElement(By.xpath("//a[.='Check Box']")).click() ;
		Thread.sleep(1000);
		// to find all the check box elements on web page by using cssSelector()
		List<WebElement> cb = dr.findElements(By.cssSelector("input[type='checkbox']"));
		// length of list
		System.out.println(cb.size());
		// to click all the check boxes
		for (WebElement wb : cb) {
			wb.click();
			Thread.sleep(1000);
		}
		// to close the browser
		dr.quit();

	}

}
