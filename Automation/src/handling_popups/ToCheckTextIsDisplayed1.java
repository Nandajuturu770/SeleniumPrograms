/* 
 * TO CHECK THE POPUP MESSAGE IS DISPLAYED OR NOT AFTER CLICK ON CANCEL BUTTON ON POPUP
 */
package handling_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToCheckTextIsDisplayed1 {
	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to call the method
		toCheckTextIsDisplayed1(dr);
	}

	public static void toCheckTextIsDisplayed1(WebDriver dr) throws InterruptedException {
		// to maximize the browser
		dr.manage().window().maximize();
		// to synchronization
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url
		dr.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");	
		// to find the element and click on it
		dr.findElement(By.name("policynumber")).sendKeys("123");
		// to find the element
		dr.findElement(By.name("dob")).click();
		// to find the element
		WebElement month = dr.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		// to create an object of select
		Select d = new Select(month);
		// to select the option
		d.selectByIndex(5);
		// to find the element year
		WebElement year = dr.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		// to create an object of select
		Select m = new Select(year);
		// to select the option
		m.selectByValue("2002");
		// to find the element day
		WebElement day = dr.findElement(By.xpath("//a[@class='ui-state-default']"));
		// to create an object of select
        day.click();
        // to find the element
        dr.findElement(By.id("alternative_number")).sendKeys("9845098450");
        // to wait 
        Thread.sleep(1000);
		// to find the element 
        dr.findElement(By.id("renew_policy_submit")).click();
        // to wait
        Thread.sleep(2000);
		// to verify text is displayed or not 
		boolean b = dr.findElement(By.id("policynumberError")).isDisplayed();
		if(b==true)
			System.out.println("THE TEXT IS DISPLAYED AND \"PASS\" ");
		else
			System.out.println("THE TEXT IS NOT DISPLAYED AND \"FAIL\" ");
		// to close the browser
		dr.quit();
	}
}