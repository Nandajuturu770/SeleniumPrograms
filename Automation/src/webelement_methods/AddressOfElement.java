package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddressOfElement {
	public static void main(String[] args) {
		// to open the browese
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		WebElement s = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		System.out.println(s);
	}

}
