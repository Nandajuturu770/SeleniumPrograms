package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to call the method
		dragAndDrop(dr);
	}

	public static void dragAndDrop(WebDriver dr) throws InterruptedException {
		// to maximize the browser
		dr.manage().window().maximize();
		// to syncronization
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url
		dr.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		// to find the element changed element
		WebElement cha = dr.findElement(By.id("box7"));
		// to find the element to chaged optinon
		WebElement toCh = dr.findElement(By.id("box4"));
		// to create an object for actions class
		Actions a = new Actions(dr);
		// to wait 
		Thread.sleep(3000);
		// to call the drag and drop method
		a.dragAndDrop(cha, toCh).perform();
		Thread.sleep(2000);
		// to close the browser
		//dr.quit();
	}
}
