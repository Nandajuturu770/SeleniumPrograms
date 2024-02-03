
/* to check where the check box is selected or not*/

package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckSelect {

	public static void main(String[] args) throws InterruptedException {
		// to open browser
		WebDriver drive = new ChromeDriver();
		checkSelect(drive);
	}
	public static void checkSelect(WebDriver dr ) throws InterruptedException {
		// to sleep 
		Thread.sleep(2000);
		// to maximize 
		dr.manage().window().maximize();
		Thread.sleep(2000);
		// to enter url
		dr.get("https://demo.opensourcebilling.org/");
		Thread.sleep(2000);
		// to find the element of text field
		/* isSelected() : 
		 * which is used to check whether the Check box  is selected or not 
		 * it will return the boolean value */
		boolean n = dr.findElement(By.xpath("//label[.='Keep me signed in']")).isSelected();
		Thread.sleep(2000);
		// to display the result according to out put of boolean value
		if (n == true)
			System.out.println(" the Check box is selected \" passed \"");  
		else
			System.out.println(" the Check box is \"not\" selected \"failed\"");
		// to close the browser 
		dr.quit();

	}

}
