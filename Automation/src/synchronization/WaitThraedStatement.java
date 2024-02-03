package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitThraedStatement {

	public static void main(String[] args) {
WebDriver driver = new  ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i phone ");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.quit();
}

}
