/* TO PRINT THE FIRST SELECTED OPTIONS FRON MULTI SELECTED LIST BOX 
 * ==> getFirstSelectedOption() : which used to get first selected option
 * ==> 2.getAllSelectedOptions() : which is used to get all the selected options which are default selected
 */
package list_box;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintfirstSelectedOpt {
	public static void main(String[] args) {
		// to open the browser
		WebDriver dr = new FirefoxDriver();
		// to call the method
		printfirstSelectedOpt(dr);
	}
	public static void printfirstSelectedOpt(WebDriver dr) {
		// to maximize 
		dr.manage().window().maximize();
		// to synchronization
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url 
		dr.get("file:///D:/fireflink/Food.html");
		// to find the element
		WebElement we = dr.findElement(By.id("bf"));
		// to create an object of select class to call the method
		Select s = new Select(we);
		// to print selected option
		System.out.println(s.getFirstSelectedOption().getText());
		// to call the method
		List<WebElement> allSelOpts = s.getAllSelectedOptions();
		// to print the all selected options
		for (WebElement wE : allSelOpts) {
			System.out.println(wE.getText());
		}
		// to close
		dr.quit();
	}
}
