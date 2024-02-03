package HandlingMouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropElements {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	WebElement move = driver.findElement(By.id("box4"));
	WebElement dest = driver.findElement(By.id("box3"));
	Actions a = new Actions(driver);
	Thread.sleep(5000);
	a.dragAndDrop(move, dest).perform();
	driver.quit();	
	}
}
