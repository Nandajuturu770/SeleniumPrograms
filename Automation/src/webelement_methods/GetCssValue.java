
/* GET CSS VALUE FROM THE HTML COME BY USING "getCssValue()" METHOS */

package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {
	public static void getCssValue(WebDriver dr) throws InterruptedException {
		// maximize the browser
		dr.manage().window().maximize();
		// to sleep
		Thread.sleep(2000);
		// to enter url
		dr.get("https://www.facebook.com/");
		// to find the element 
		WebElement e = dr.findElement(By.linkText("Forgotten password?"));
		String s = e.getCssValue("color");
		String st = e.getCssValue("font-size");
		String st1 = e.getCssValue("font-family");
		System.out.println("Colour : "+s+"\nFont Size : "+st+"\nFont Type : "+st1);
		// to close browser
		dr.quit();
	
	}
	public static void main(String[] args) throws InterruptedException {
		// to open browser 
		WebDriver dr = new ChromeDriver();
		getCssValue(dr);
		
	}
}
