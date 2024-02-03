
/* to clear the text from the text field with help of clear() method of web element interface */

package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveText {

	public static void main(String[] args) throws InterruptedException {
    // to open browser
		WebDriver drive = new ChromeDriver();
		removeText(drive);
				
	}
	public static void removeText(WebDriver dr ) throws InterruptedException {
		// to sleep 
		Thread.sleep(2000);
		// to maximize 
		dr.manage().window().maximize();
		Thread.sleep(2000);
		// to enter url
		dr.get("https://demo.opensourcebilling.org/");
		Thread.sleep(2000);
		// to find the element of text field
		/* clear() : 
		 * which is used to delete the text from the text field */
		dr.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		// to close the browser 
		dr.quit();
	}

}
