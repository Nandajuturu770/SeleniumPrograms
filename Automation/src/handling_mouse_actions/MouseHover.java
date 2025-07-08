package handling_mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.partialLinkText("Resources"));
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(target).perform();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Contact Us")).click();
		Thread.sleep(2000);
		String phone = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[1]/div/div[2]/div/p[2]")).getText();
		System.out.println(phone);
		driver.close();
	}
}
