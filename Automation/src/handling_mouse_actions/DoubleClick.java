package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to call the method
		doubleClick(dr);
	}
	public static void doubleClick(WebDriver dr) {
		// to maximize the broser
		dr.manage().window().maximize();
		// to synchronisation
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url
		dr.get("https://www.vtiger.com/");
		// to find the element
		WebElement target = dr.findElement(By.partialLinkText("Resources"));
		// to move the pointer of the mousehover , we need to create a Actions class object 
		// because all the methods or non static members
		Actions a =new Actions(dr);
		// to call the method to move the pointer
		a.moveToElement(target).perform();
		// to find the element to click
		dr.findElement(By.partialLinkText("Customers")).click();
		// to find the element and store into the web element 
		WebElement dbl = dr.findElement(By.id("loginspan"));
		// to call the method and call the element to click the double times
		a.doubleClick(dbl).perform();
		// to store the tittle of the web page 
		String tittle = dr.getTitle();
		// to verifying the result
		if(tittle.contains("Login"))
			System.out.println("login page is displayed and \"PASS\"");
		else
			System.out.println("login pages is not displayed \"FAIL\"");
		dr.quit();
	}
}

