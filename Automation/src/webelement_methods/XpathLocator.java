
/* to find element by using xpath : 
 * which is path of element of web page in html tree 
 * ==> in xpath we have two types they are 
 * --> 1. Absolute xpath  : 
 *        which starts from the  tag name to the desired element or required element
 *        
 * --> 2. relative xpath : 
 *        which starts from the descendant or child  to the desired element or required element  
 * */
package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathLocator {
	public static void main(String[] args) throws InterruptedException {
		// to open the browser 
		WebDriver dr = new ChromeDriver();
		xpathLocator(dr);
		WebDriver dr1 = new FirefoxDriver();
		xpathLocator(dr1);
	}
	
	public static void xpathLocator(WebDriver dr) throws InterruptedException {

		// to maximize the browser
		dr.manage().window().maximize();
		// to sleep 
		Thread.sleep(2000);
		// to enter url 
		dr.get("file:///D:/fireflink/all%20is%20well.html");
		Thread.sleep(2000);
		/* by absolute xpath to find the element of web page 
		 * ++ here forward slash (/) is used to move the control from the parent tag name to child tag name */
		dr.findElement(By.xpath("/html/body/center/form/a")).click();
		Thread.sleep(2000);
		// to get title 
		String s = dr.getTitle();
		// to print the title on console
		if(s.equals("Google"))
		    System.out.println("the test is successfullt \"PASSED\" ");
		else
			System.out.println("the test is \"not\" successfullt \"FAILED\" ");	
		// to navigate to back 
		dr.navigate().back();
		dr.quit();
		
	}

}
