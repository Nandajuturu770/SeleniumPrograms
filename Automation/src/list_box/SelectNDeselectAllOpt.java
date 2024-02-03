/*
 * SELECT ALL THE LIST OPTIONS AND DESELECT ALL THE OPTIONS FROM END TO TOP
 * ==> 1.selectByIndex(int num) 2.deselectByIndex(int num) 3.deselectAll() 
 */
package list_box;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectNDeselectAllOpt {
	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		WebDriver dr = new FirefoxDriver();
		// to call the method
		selectNDeselectAllOpt(dr);
	}

	public static void selectNDeselectAllOpt(WebDriver dr) throws InterruptedException {
		// to maximize
		dr.manage().window().maximize();
		// to synchronization
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter url 
		dr.get("file:///D:/fireflink/Food.html");
		// to find the element
		WebElement we = dr.findElement(By.id("bf"));
		// to create an object 
		Select s = new Select(we);
		// to call the method of get options
		List<WebElement> allOptWe = s.getOptions();
		// to select all the options 
		for (int i = 0 ; i < allOptWe.size() ; i++) {
			Thread.sleep(250);
			s.selectByIndex(i);
		}
		// to deselect all the options 
		for (int i = allOptWe.size()-1; i >= 0; i--) {
			Thread.sleep(250);
			s.deselectByIndex(i);
		}
		/* to delete all selected options 
		 * we have an method : s.deselectAll()
		 */
		//s.deselectAll();
		// to close
		dr.quit();
	}
}
