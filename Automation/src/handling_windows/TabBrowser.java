package handling_windows;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabBrowser {
	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to call the method
		tabBrowser(dr);
	}

	public static void tabBrowser(WebDriver dr) throws InterruptedException {
		// to maximize the browser
		dr.manage().window().maximize();
		// to syncronization
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url
		dr.get("https://www.flipkart.com/");
		// to click on the cancel button 
		dr.findElement(By.xpath("//span[.='✕']")).click();
		// to find the element on web page and send the data
		dr.findElement(By.name("q")).sendKeys("i phone 15 pro max");
		// to find the click on the element
		dr.findElement(By.xpath("(//div[.='i phone 15pro max'])[1]")).click();
		// to click on the element
		dr.findElement(By.xpath("(//div[contains(text(),'APPLE iPhone 15 Pro Max')])[1]")).click();
		// to get window handle of parent 
		String pwid = dr.getWindowHandle();
		// to print the title
		System.out.println(dr.getTitle());
		// to store the child wids
		String cwid = null ;
		// to get all the window hangles
		Set <String > wids = dr.getWindowHandles();
		for (String wid : wids) {
			if(!wid.equals(pwid))
				cwid = wid ;
		}
		Thread.sleep(2000);
		// to switch the tab
		dr.switchTo().window(cwid);
		// print the title of the tab
		System.out.println(dr.getTitle());
		// to close the browser
		dr.quit();
	}
}
