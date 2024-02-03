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

public class PrintAllListUniOptInAsc {
	public static void main(String[] args) {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to call the method
		printAllListUniOptInAsc(dr);
	}

	public static void printAllListUniOptInAsc(WebDriver dr) {
		// to maximize
		dr.manage().window().maximize();
		// to wait
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the utl
		dr.get("file:///D:/fireflink/Food.html");
		// to find the element 
		WebElement listWe = dr.findElement(By.id("bf"));
		// to create an object of select class
		Select s = new Select(listWe);
		// to call the method of select class
		List <WebElement> allOpt = s.getOptions();
		// to create an of set Class to remove duplicate 
		Collection <String> set = new HashSet<String>();
		// to add the element in to the set 
		for (WebElement we : allOpt) {
			set.add(we.getText());
		}
		// to create an object of array list for ascending order
		ArrayList<String> al = new ArrayList<String>();
		// to add element into array list from set 
		for (String str : set) {
			al.add(str);
		}
		// to sort the element 
		al.sort(null);
		// to print the elements
		System.out.println(al);
		for (String str : al) {
			System.out.println(str);
		}
		// to close the browser
		//dr.quit();
	}
}
