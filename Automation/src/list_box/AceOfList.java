package list_box;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AceOfList {
	public static void main(String[] args) {
    // to open the browser
		WebDriver dr = new ChromeDriver();
		// to maximize the browser
		dr.manage().window().maximize();
		// to syncronization
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to navigate the application
		dr.get("file:///D:/fireflink/Food.html");
		// to find the element 
		WebElement we = dr.findElement(By.id("bf"));
		// to action on the list box
		Select s = new Select(we);
		// to get all the options
		List<WebElement> allWe = s.getOptions();
		// to find the length of the list
		int len = allWe.size();
		// to store and acs order
		Set<String> ts = new TreeSet<String>();
		for( WebElement w  : allWe) {
			ts.add(w.getText());
		}
		System.out.println(ts);
		for (String st : ts) {
			System.out.println(st);
		}
		// to close of the browser
		dr.close();
	}
}
