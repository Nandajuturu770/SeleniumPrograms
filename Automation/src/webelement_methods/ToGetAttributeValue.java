
/* TO GET THE VALUE OF THE ATTRIBUTE */

package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToGetAttributeValue {

	static public String toGetAttributeValue (WebDriver dr ) throws InterruptedException {
		// to maximize 
		dr.manage().window().maximize();
		// to sleep 
		Thread.sleep(2000);
		// to enter url 
		dr.get("https://www.facebook.com/");
		Thread.sleep(2000);
		// to find the element
		/* getAttribute() : 
		 * which is used to get value  of the particular attribute
		 */
		String st = dr.findElement(By.xpath("//a[.='Forgotten password?']")).getAttribute("href");
		System.out.println(st);
		// to close the browser
		dr.quit();
		return st ;
	}
	public static void main(String[] args) throws InterruptedException {
		// to open the browser 
		WebDriver dr1 = new ChromeDriver();
		System.out.println("FROM CHROME");
		String c = toGetAttributeValue(dr1);
		WebDriver dr2 = new FirefoxDriver();
		System.out.println("FROM FIRE FOX");
		String f = toGetAttributeValue(dr2);
		if(c.equals(f))
			System.out.println("both are same and \"PASSED\"");
		else
			System.out.println("both are NOT  same and \"FAILED\"");
		
		/*System.out.println(c.length()+"\n"+f.length());
		for(int i = 0 ; i < c.length() ; i++) {
			if(c.charAt(i) != f.charAt(i)) {
				System.out.println("not matching" + i);
				System.out.println(c.charAt(i)+"  "+f.charAt(i));
			}
		}*/ 
	}

}
