package handling_mutli_elements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinkUrl {
	public static void main(String[] args) throws AWTException, InterruptedException {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to call the method
		allLinkUrl(dr);
	}

	public static void allLinkUrl(WebDriver dr) throws AWTException, InterruptedException {
		// to maximize the browser
		dr.manage().window().maximize();
		// to syncronization
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url
		dr.get("https://www.google.com/");
		// to enter the date into the element
		dr.switchTo().activeElement().sendKeys("wipro jobs");
		// to click on the enter 
		Robot r = new Robot();
		// to press the button
		r.keyPress(KeyEvent.VK_ENTER);
		// to get all the links element 
        List<WebElement> allLinks = null ; 
        // to tasting
        JavascriptExecutor j = (JavascriptExecutor) dr;
        // to find the all element 
        for(int i = 0 ; i <= 10000 ; i+=2000) {
        	// to scroll 
        	j.executeScript("window.scrollBy(0,"+i+")");
        	// to store 
        	allLinks = dr.findElements(By.xpath("//a"));
        	// to wait
        	Thread.sleep(2000);
        }
        // size of the list
        System.out.println(allLinks.size());
        // to print the all url of the links 
        for (WebElement we : allLinks) {
			System.out.println(we.getAttribute("href"));
		}
        // to close the browser
        dr.quit();
	}
}
