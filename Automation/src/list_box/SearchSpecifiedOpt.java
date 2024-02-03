/* 
 * TO SEARCH THE SPECIFIED OPTION IN LIST BOX 
 */
package list_box;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchSpecifiedOpt {
	public static void main(String[] args) {
		// to read value from user
		Scanner sc = new Scanner(System.in);
		// to print message to user
		System.out.println("enter your searchig element in list box ");
		// to store the element in variable 
		String ele = sc.nextLine();
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to call the method
		searchSpecifiedOpt(dr,ele);
	}

	public static void searchSpecifiedOpt(WebDriver dr, String ele) {
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
		// to create object of Array list for store the text of each options of list box
		ArrayList <String> al = new ArrayList<String>();
		// to add the element text in the Array list 
		for (WebElement we : allListOpt) {
			al.add(we.getText());
		}
		//System.out.println(al);
		// to verify that specified option is present or not
		int coun = 0 ;
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i).equalsIgnoreCase(ele)) {
				coun++;
				break ;
			}
		}
		// to display proper message to user 
		if(coun>0)
			System.out.println("your element "+ele+" is presented ");
		else
			System.out.println("your element "+ele+" is not presented ");
		// to close the browser
		dr.quit();
	}
}
