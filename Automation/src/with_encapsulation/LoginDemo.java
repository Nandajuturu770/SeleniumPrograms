package with_encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginDemo {
	private WebElement ustx ;
	private WebElement pwtx ;
	private WebElement lgbt ;
	public LoginDemo(WebDriver dr) {
		ustx = dr.findElement(By.id("username"));
		pwtx = dr.findElement(By.name("pwd"));
		lgbt = dr.findElement(By.xpath("//div[text()='Login ']"));
	}
	public void setValues(String us , String pw ) {
		ustx.sendKeys(us);
		pwtx.sendKeys(pw);
		lgbt.click();
	}
}
