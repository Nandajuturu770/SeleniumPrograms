/* TO CHECK WHETHER THE PAGE IS LOADED WITH THE SPECIFY TIME*/

package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTime {
	public static void main(String[] args) {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to call the method
		pageLoadTime(dr);
	}

	public static void pageLoadTime(WebDriver dr) {
		// to maximize 
		dr.manage().window().maximize();
		// to wait
		dr.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		try {
			dr.get(" https://www.facebook.com/");
			System.out.println("\"THE FACE BOOK PAGE IS LOADED WITH IN 3 Sce AND \\\"PASS\\\" \"");
		}
		catch(Exception e ) {
			System.out.println("THE FACE BOOK PAGE IS NOT LOADED WITH IN 3 Sce AND \"FAIL\" ");
		}
		// to close
		dr.quit();
	}
}
