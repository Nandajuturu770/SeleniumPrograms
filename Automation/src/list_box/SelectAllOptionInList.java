/*
  TO SELECT ALL THE OPTIONS OF LIST BOX 
 */
package list_box;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOptionInList {
	public static void main(String[] args) throws InterruptedException {
		// to open the browser 
		WebDriver dr = new ChromeDriver();
		// to call the method
		selectOptionInList(dr);
	}

	public static void selectOptionInList(WebDriver dr) throws InterruptedException {
		// to maximize
		dr.manage().window().maximize();
		// to 
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url 
		dr.get("file:///D:/fireflink/Food.html");
		// to find element of list box
		WebElement we = dr.findElement(By.id("bf"));
		// to create an object of select class
		Select s = new Select(we);
		List<WebElement> allWe = s.getOptions();
		for (int i = 0; i < allWe.size(); i++) {
			Thread.sleep(500);
			s.selectByIndex(i);
		}
		//to close the browser
		dr.quit();

	}
}
