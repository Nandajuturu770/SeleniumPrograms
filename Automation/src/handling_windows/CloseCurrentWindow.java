package handling_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseCurrentWindow {

	public static void main(String[] args) {
WebDriver driver =new ChromeDriver();
driver.get("https://secure.indeed.com/");
driver.findElement(By.id("login-google-button")).click();
driver.findElement(By.id("apple-signin-button")).click();
driver.close();
	}

}
