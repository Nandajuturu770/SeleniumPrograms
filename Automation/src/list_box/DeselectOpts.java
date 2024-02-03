/* 
 * TO DESELECT THE OPTIONS OF MULTI SELECTED LIST BOX 
 * ==>1.deselectByIndex(integer) 2.deselectByValue(Sting) 3. deselectByVisibleText(String)
 */
package list_box;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectOpts {
	public static void main(String[] args) throws InterruptedException {
		// to open browser
		WebDriver dr = new EdgeDriver();
		// to call the method
		deselectOpts(dr);
	}

	private static void deselectOpts(WebDriver dr) throws InterruptedException {
		// to maximize 
		dr.manage().window().maximize();
		// to synchronization
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url
		dr.get("file:///D:/fireflink/Food.html");
		// to find the element
		WebElement we = dr.findElement(By.id("m"));
		// to select opts
		Select s = new Select(we);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("bb");
		Thread.sleep(2000);
		s.selectByVisibleText("poori");
		Thread.sleep(2000);
		// to deselect options
		s.deselectByIndex(0);
		Thread.sleep(2000);
		s.deselectByValue("bb");
		Thread.sleep(2000);
		s.deselectByVisibleText("poori");
		Thread.sleep(2000);
		// to close 
		dr.quit();
	}
}
