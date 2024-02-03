package handling_popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDowloadPopup {
public static void main(String[] args) throws AWTException, InterruptedException {
	// to open the browser
	WebDriver dr = new FirefoxDriver();
	// to call the method
	fileDowloadPopup(dr);
}

public static void fileDowloadPopup(WebDriver dr) throws AWTException, InterruptedException {
   // to maximize the browser
	dr.manage().window().maximize();
	// to synchronization
	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	// to enter the url 
	dr.get("https://www.selenium.dev/downloads/");
	// to click on the element
	dr.findElement(By.partialLinkText("4.")).click();
	// to wait
	Thread.sleep(2000);
	// to click on the download popup for create an object of Robot
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	
	r.keyPress(KeyEvent.VK_O);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_ENTER);
	// to close the browser
	dr.quit();
}
}
