package list_box;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AscendingOrder {
	public static void main(String[] args) {
		// to read the data from the user
		Scanner in = new Scanner(System.in);
		System.out.println("please enter the address of element ");
		String we = in.next();
		// to open the browser
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to call the method
		ascendingOrd(dr , we );

	}

	public static void ascendingOrd(WebDriver dr, String we) {
		dr.get("file:///D:/fireflink/Food.html");
		WebElement ele = dr.findElement(By.id(we));
		Select s = new Select(ele);
		// to get all the options of list box
		List<WebElement> allwe = s.getOptions();
		ArrayList< String > al = new ArrayList<String>();
		for (WebElement str : allwe) {
			al.add(str.getText());
		}
		// to print into ascending order
		Collections.sort(al);
		// to print all the element on the console
		for (String str : al) {
			System.out.println(str);
		}
		// to remove the duplicate value from the list
		System.out.println("after removing the duplicate value from the list ==> ");
		Set<String> ts = new TreeSet<String>();
		for (String str : al) {
		   if(ts.add(str))
			   System.out.println(str);
		}
		dr.close();
	}
}
