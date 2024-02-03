/*
 * getWrappedElemen() : which returns all the options present in list box 
 * isMutliple() : which is used to check whether the list is multiple selected or not
 */
package list_box;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElements {
	public static void main(String[] args) {
		// to open the browser
		WebDriver dr = new FirefoxDriver();
		// to call the method
		getWrappedElements(dr);
	}
	public static void getWrappedElements(WebDriver dr) {
		// to maximize 
		dr.manage().window().maximize();
		// to synchronization
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url 
		dr.get("file:///D:/fireflink/Food.html");
		// to find the element
		WebElement we = dr.findElement(By.id("m"));
		// to create an object of select class to call the method
		Select s = new Select(we);
		// to check multiple
		boolean b = s.isMultiple();
		if(b==true) {
			System.out.println("YES it is multiple selected ");
			// to call the method
			WebElement allWe = s.getWrappedElement();
			// to print 
			System.out.println(allWe.getText());
		}
		else 
			System.out.println("NO it is multiple selected");
		// to close
		dr.quit();
	}
}
