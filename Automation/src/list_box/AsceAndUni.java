package list_box;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AsceAndUni {
	public static void main(String[] args) {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to maximize the browser
		dr.manage().window().maximize();
		// to syncronisation
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to calling the method
		csceAndUni(dr);
	}

	public static void csceAndUni(WebDriver dr) {
		// to enter the url
		dr.get("file:///D:/fireflink/Food.html");	
		// to find the element on page
		WebElement we = dr.findElement(By.id("bf"));
		// to control the list box
		Select s = new Select(we);
		// to store the all options in list
		List <WebElement> all = s.getOptions();
		// to store the all text of options of elements and ascending order
		TreeSet<String> ele = new TreeSet<String>();
		// to add the all text from element to tree set collection
		for(WebElement e : all ) {
			ele.add(e.getText());
		}
		// to print the all options in the console
		for (String str : ele) {
			System.out.println(str);
		}
		// to close the browser
		dr.quit();
	}
}
