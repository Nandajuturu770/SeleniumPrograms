/*
 * SELECT YOUR DATE OF BIRTH 
 * ==> 1.selectByIndex(int num ) 2.selectByValue(String str)3.selectByVisibleText(String str)
 */
package list_box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDOB {
	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to call the method
		selectDOB(dr);
	}

	public static void selectDOB(WebDriver dr) throws InterruptedException {
		
		// to maximize 
        dr.manage().window().maximize();
        // to enter the url
		dr.get(" https://www.facebook.com/");
		// to wait 
		Thread.sleep(2000);
		// to find the element 
		dr.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		/* to select options :
		 * we need to  create an object for Select Class for using the method of select options 
		 * we need to pass the argument as web element type in constructor 
		 * to call the method Select class Object reference 
		 */
		// to find the element
		WebElement Date = dr.findElement(By.id("day"));
		// to create an Object
		Select s1= new Select(Date);
		// to call the method and select option by index
		s1.selectByIndex(2);
		Thread.sleep(2000);
		WebElement month = dr.findElement(By.id("month"));
		Select s2= new Select(month);
		// to call the method and select option by value
		s2.selectByValue("4");
		Thread.sleep(2000);
		WebElement Year = dr.findElement(By.id("year"));
		Select s3= new Select(Year);
		// to call the method and select option by Visible text
		s3.selectByVisibleText("2001");
		Thread.sleep(2000);
		// to navigate back
		dr.navigate().back();
		// to close the browser
		dr.quit();

	}

}
