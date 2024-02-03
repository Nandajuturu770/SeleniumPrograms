/*
 * TO PRINT THE OPTIONS OF LIST WITH OUT DUPLICATE OPTIONS IN IT 
 */
package list_box;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionsWtDuplee {
	public static void main(String[] args) {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to call the method
		printAllOptionsWtDuplee(dr);
	}

	public static void printAllOptionsWtDuplee(WebDriver dr) {
		// to maximize
		dr.manage().window().maximize();
		// to wail
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url
		dr.get("file:///D:/fireflink/Food.html");
		// to find element
		WebElement listWe = dr.findElement(By.id("bf"));
		// to create an object of Select class
		Select s = new Select(listWe);
		// to store all the elements in list 
		List<WebElement> allListOpt = s.getOptions();
		// to create object of set and Store the elemenemt 
		Set set = new HashSet();
		// to add the into set 
		for (WebElement we : allListOpt) {
			set.add(we.getText());
		}
		//System.out.println(set);
		// to print the elements
		for (Object obj : set) {
			System.out.println(obj);
		}
		// to close the browser
		dr.quit();
	}
}
