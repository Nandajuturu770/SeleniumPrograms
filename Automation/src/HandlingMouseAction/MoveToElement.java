package HandlingMouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.get("https://www.vtiger.com/");
		WebElement we = dr.findElement(By.id("navbarPages"));
		Actions a = new Actions(dr);
		a.moveToElement(we).perform();
		dr.quit();
	}
}

