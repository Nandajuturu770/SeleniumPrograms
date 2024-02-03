
/* to check whether the logo of face book is displayed or not */

package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToVerifyLogo {
	public static void main(String[] args) throws InterruptedException {
		// to open browser
		WebDriver driver= new ChromeDriver();
		toVerifyLogo(driver);
	    WebDriver driver1 = new FirefoxDriver();
		toVerifyLogo(driver1);
	}

	public static void toVerifyLogo (WebDriver driver) throws InterruptedException {
		
		// to maximize the browser
		driver.manage().window().maximize();
		// to enter url into browser
		driver.get("https://www.facebook.com/");
		// to sleep
		Thread.sleep(3000);
		// to find the element in web page and check which displayed or not
		
		/* here isDisplayed(): 
		 * which is used to verify the element is displayed or not 
		 * which returns the boolean value 
		 */
		boolean logo = driver.findElement(By.xpath("//img[@alt='Facebook\']")).isDisplayed();
		// to print the result according to boolean value
		if(logo==true)
			System.out.println(" the logo is displayed \"Pass\" ");
		else
			System.out.println(" the logo is not displayed \"Fail\" ");
		// to close the 
        driver.quit(); 
		
	}
}
