
/* automation script to test the application in different browser ===> soft coding */

package webelement_methods;

import org.openqa.selenium.WebDriver;

public class Test {
	public static void test(WebDriver driver ) throws InterruptedException {
		// to enter the url 
		driver.get("https://www.gmail.com/");
		// to wait
		Thread.sleep(2000);
	    // to get title
		String name = driver.getTitle();
		// to print the title
		System.out.println(name);
		Thread.sleep(2000);
		// to close browser
		driver.quit();
	}
}
