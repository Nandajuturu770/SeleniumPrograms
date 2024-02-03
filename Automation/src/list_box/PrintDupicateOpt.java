/*
 *  TO PRINT THE DUPLICATE OPTIONS IN THE LIST 
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

public class PrintDupicateOpt {
	public static void main(String[] args) {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to call the method
		printDupicateOpt(dr);
	}

	public static void printDupicateOpt(WebDriver dr) {
		// to maximize
		dr.manage().window().maximize();
		// to wail
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url
		dr.get("file:///D:/fireflink/Food.html");
		// to find element
		WebElement listWe = dr.findElement(By.id("bf"));
		// to create an object
		Select s = new Select(listWe);
		// to store all the elements in list 
		List<WebElement> allListOpt = s.getOptions();
		// to create object of Array list and store the elements
		ArrayList <String> al = new ArrayList<String>();
		// to add the element into the array list 
		for (WebElement we : allListOpt) {
			al.add(we.getText());
		}
		// to check duplicate options are present or not 
		for (int i = 0; i < al.size(); i++) {
			for(int j = i+1 ; j < al.size(); j++) {
				if (al.get(i).equals(al.get(j))) {
					System.out.println(al.get(i));
					break ;
				}
			}
		}
		// to close the browser
		dr.quit();
	}
}
