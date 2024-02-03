
/* driver class the test application with different browser by creating object and pass the reference 
   variable to that method */

package webelement_methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TestDriver {

	public static void main(String[] args) throws InterruptedException {
		// to open chrome driver 
		WebDriver wd = new ChromeDriver();
		Test.test(wd);
		// to open firefox driver
		WebDriver wd1 = new FirefoxDriver();
		Test.test(wd1);
		// to open edge driver
		WebDriver wd2 = new EdgeDriver();
		Test.test(wd2);
	}	
}
