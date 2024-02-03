package list_box;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOpts {
	public static void main(String[] args) {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to call the method
		selectAllOpts(dr);
	}

	public static void selectAllOpts(WebDriver dr) {
		// to maximize 
		dr.manage().window().maximize();
		// to wait
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter url
		dr.get("file:///D:/fireflink/Food.html");
		// to find element
		WebElement listWe = dr.findElement(By.id("bf"));
		// to create an object of select class 
		Select s = new Select(listWe);
		// to call the method 
		List<WebElement> allOptsWe = s.getOptions();
		// to select all the options 
		for (int i = 0 ; i < allOptsWe.size() ; i ++) {
			// by using select by index
			s.selectByIndex(i);
		}
		// to deselect all the options 
		s.deselectAll();
	}
}
