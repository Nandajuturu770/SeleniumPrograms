/* to print popup */
package handling_popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopup {
	public static void main(String[] args) throws InterruptedException, AWTException {
		// to open the browser
		WebDriver dr = new FirefoxDriver();
		// to call the method
		printPopup(dr);
	}

	public static void printPopup(WebDriver dr) throws InterruptedException, AWTException {
		// to maximize
		dr.manage().window().maximize();
		// to find the element
		dr.get("https://www.selenium.dev/downloads/");
		// to wait 
		Thread.sleep(2000);
		// to press the keys we need to create an object of robot class
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000)
		
		;
		for (int i = 1; i <=3; i++) {
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_TAB);
		}
		Thread.sleep(2000);
		for (int i = 1; i <= 4; i++) {
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_DOWN);
		}
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_MINUS);
		r.keyPress(KeyEvent.VK_2);
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_ENTER);
        dr.quit();
	}
}
