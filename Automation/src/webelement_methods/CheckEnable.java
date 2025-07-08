
/* to check whether the button is enabled or not by using isEnabled() method of web element interface */

package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckEnable {

	public static void main(String[] args) {
		// set up broweser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("\"https://www.facebook.com/");
		// to find the elment 
		WebElement elemement = driver.findElement(By.xpath("//button[@name='login']"));
		if(checkElementIsEnabled(elemement))
			System.out.println(" the login button is enable \" passed \"");
		else
			System.out.println(" the login button is \"not\" enabled \"failed\"");
		driver.quit();	
	}


	/**
	 * @description this method is used to check the givem element is enabled or not.
	 * @param elemement <code>WebElement</code>
	 * @return status   <code>boolean</code>
	 */
	public static boolean checkElementIsEnabled(WebElement elemement) {
		try {
			return elemement.isEnabled();
		}catch (Exception exception) {
			System.err.println(exception.getMessage());
			return false;
		}
	}
}