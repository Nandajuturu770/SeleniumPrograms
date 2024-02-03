
/* by using locators */

package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocator {

	public static void main(String[] args) throws InterruptedException {
		// open browser
		WebDriver driver = new ChromeDriver();
		// maximize the browser 
		driver.manage().window().maximize();
		// enter url 
		driver.get("file:///D:/fireflink/all%20is%20well.html");
		// to get locator by using ==>tagName()
		WebElement e = driver.findElement(By.tagName("a"));
		// to click on link 
		e.click();
		// to get title 
		String t = driver.getTitle();
		if(t.equals("Google"))
			System.out.println("pass");
		else
			System.out.println("fail");
		// to go back 
		driver.navigate().back();
		Thread.sleep(3000);
		String s = driver.getCurrentUrl();
		System.out.println(s);
		// to get locator by using ==>id()
		driver.findElement(By.id("abc")).click();
		driver.navigate().back();
		// to get locator by using ==>name()
		driver.findElement(By.name("nanda")).click();
		driver.navigate().back();
		// to get locator by using ==>className()
		driver.findElement(By.className("kiran")).click();
		driver.navigate().back();
		driver.quit();
	}


}
