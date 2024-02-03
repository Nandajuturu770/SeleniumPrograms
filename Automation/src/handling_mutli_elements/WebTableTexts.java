package handling_mutli_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTexts {

	public static void main(String[] args) throws InterruptedException {
    // to open the browser 
	WebDriver dr = new ChromeDriver();
	// to call the method
	webTableTexts(dr);

	}
	public  static void webTableTexts(WebDriver dr) throws InterruptedException {
		// to maximize
				dr.manage().window().maximize();
				// to sleep
				Thread.sleep(2000);
				// to enter url 
				dr.get("file:///D:/fireflink/Table.html");
				Thread.sleep(1000);
				// to find all the elements on web page
				List<WebElement> tb = dr.findElements(By.xpath("//td"));
				// length of list
				System.out.println(tb.size());
				// to print all texts of table 
				for(int i = 0; i < tb.size(); i++) {
					System.out.println(tb.get(i).getText());
				}
				// to close the browser 
				dr.quit();
		
	}

}
