
/* to get the html code of web page */

package webelement_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHtmlCode {

	public static void main(String[] args) throws InterruptedException {
    WebDriver d = new ChromeDriver();
    printHtmlCode(d);
	}
	public static void printHtmlCode(WebDriver d ) throws InterruptedException{
		// to max
		d.manage().window().maximize();
		// to wait 
		Thread.sleep(2000);
		// to enter url 
		d.get("https://www.gmail.com/");
		// to get html code 
		String htmlCode = d.getPageSource();
		// to print on console 
		System.out.println(htmlCode);
		// to close 
		d.quit();
	}
}
