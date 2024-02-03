
/* by using cssSelector method find the element in web page */
// syntax : cssSelector("tagName[attributeName = 'attributeValue']")

package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		// to open browser
		WebDriver driver = new ChromeDriver();
		// to maximize the browser
		driver.manage().window().maximize();
		// to wait 
		Thread.sleep(2000);
		// to enter the url into the browser 
		driver.get("file:///C:/Users/JUTURU%20NANDAKIRAN/Desktop/google.html");
		Thread.sleep(2000);
		// to the web element by using cssSelector locator
		driver.findElement(By.cssSelector("a[id='d1']")).click();
		Thread.sleep(2000);
		// to display the title of web page 
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		// to click on another link of google by using cssSelector 
		driver.findElement(By.cssSelector("a[href='https://www.Jspiders.com']")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.close();
	}

}
