
/* to find the location of the element of web page (axis values of elements)*/

package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValuesOfXandY {
	public static void main(String[] args) throws InterruptedException {
		// to open the browser 
		System.out.println("FROM CHROME DRIVER");
		WebDriver dr1 = new ChromeDriver();
		valuesOfXandY(dr1);
		System.out.println("FROM FIREFOX DRIVER");
		WebDriver dr2 = new FirefoxDriver();
		valuesOfXandY(dr2);
	}

	public static void valuesOfXandY(WebDriver dr ) throws InterruptedException {
	    // to maximize 
		dr.manage().window().maximize();
		// to sleep 
		Thread.sleep(2000);
		// to enter url 
		dr.get("https://www.facebook.com/");
		// to find element in web page 
		WebElement e = dr.findElement(By.xpath("//button[@name='login']"));
		int x = e.getLocation().getX();
		int y = e.getLocation().getY();		
	    System.out.println("Value of X-Axis : "+x+"\nValue of Y-Axis : "+y);
	    // to close 
	    dr.quit();

	}

}
