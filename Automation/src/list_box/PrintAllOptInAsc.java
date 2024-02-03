/* 
 * TO PRINT THE ALL OPTIONS OF LIST IN ASCENDING ORDER 
 */
package list_box;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptInAsc {
	public static void main(String[] args) {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to call the method
		mutlipleListBox(dr);
	}
	public static void mutlipleListBox(WebDriver dr) {
		// to maximize the browser
		dr.manage().window().maximize();
		// to wait 
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url
		dr.get("file:///D:/fireflink/Food.html");
		// to find element
		WebElement listWe = dr.findElement(By.id("bf"));
		// to create an object of select to use method
		Select s = new Select(listWe);
		// to store all the elements in list 
		List<WebElement> allListOpt = s.getOptions();
		// to create an object Array list for store the elements
		ArrayList al = new ArrayList();
		// to add the element into Array list from the list
		for (WebElement wb : allListOpt) {
			al.add(wb.getText());
		}
		// to print the element in ascending order
		al.sort(null);
		//System.out.println(al);
		// to print the element of array list 
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		//to close
		dr.quit();
	}

}
