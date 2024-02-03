
/* another way to enter url by using the navigate method and to method */

package webelement_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoNavigation {

	public static void main(String[] args) throws InterruptedException {
		// to open 
		ChromeDriver driver = new ChromeDriver();
		// to enter url 
		driver.get("https://www.google.com/");
		// to wait
		Thread.sleep(2000);
		// to get title 
		String name = driver.getTitle();
		// to print title 
		System.out.println(name); 
		Thread.sleep(2000);
		// another way to enter url ===> to navigate
		driver.navigate().to("https://www.gmail.com/");
		// to get title 
		String name1 = driver.getTitle();
		// to print
		System.out.println(name1); 
		Thread.sleep(2000); 
		// to goto back 
		driver.navigate().back();
		Thread.sleep(2000);
		// to goto forward
		driver.navigate().forward();
		Thread.sleep(2000);
		// to refresh the web page
		driver.navigate().refresh();
		Thread.sleep(2000);
		// to close the web page
		driver.quit();
	}
}
