package handling_mouse_actions;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewWindow {

	public static void main(String[] args) throws AWTException, InterruptedException {
WebDriver driver =new ChromeDriver();
driver.get("https://online.actitime.com/login");
// to find the element and rigtht click
WebElement we = driver.findElement(By.linkText("actiTIME Inc."));
Thread.sleep(2000);
// to create object of Actions class
Actions a = new Actions(driver);
Thread.sleep(2000);
a.contextClick(we).perform();
Thread.sleep(5000);
Robot r=new Robot();
r.keyPress(KeyEvent.VK_W);
Thread.sleep(2000);
driver.quit();
	}

}
