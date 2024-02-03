
/* to pass the text in the element we have an method that is sendKeys()*/

package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToEnterText {

	public static void main(String[] args) throws InterruptedException {
		// to open the browser 
		WebDriver dr = new ChromeDriver(); 
		toEnterText(dr);			
	}
	public static void toEnterText(WebDriver dr) throws InterruptedException {
		// to maximize the browser 
		dr.manage().window().maximize();
		// to enter url 
		dr.get("https://opensource-demo.orangehrmlive.com/");
		// to sleep
		Thread.sleep(2000);
		// to find the element 
		/* sendKeys() : 
		 * which is used to enter the text into the text field 
		 */
		dr.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		dr.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		String s = dr.getTitle();
		if(s.equals("OrangeHRM"))
			System.out.println("Home page is displayed PASSED ");
		else 
			System.out.println("Home page is NOT displayed FAILED ");
       // to close browser
		dr.quit();
	}

}
