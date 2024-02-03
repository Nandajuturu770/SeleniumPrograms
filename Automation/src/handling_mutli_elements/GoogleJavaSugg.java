package handling_mutli_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleJavaSugg {

	public static void main(String[] args) throws InterruptedException {
		// to open the browser 
		WebDriver dr = new ChromeDriver();
		// to call the method
		googleJavaSugg(dr);
	}
	public static void googleJavaSugg(WebDriver dr) throws InterruptedException {
		// to maximize
		dr.manage().window().maximize();
		// to sleep
		Thread.sleep(2000);
		// to enter url
		dr.get("https://www.google.co.in/");
		// to find the element and enter text
		dr.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(3000);
		// to find all the suggestions elements
		List<WebElement> sugg = dr.findElements(By.xpath("//span[contains(.,'java')]"));
		Thread.sleep(3000);
		// to print the size of list
		System.out.println(sugg.size());
		// to print all the text of the suggestions 
		for (WebElement we : sugg) {
			System.out.println(we.getText());
		}
		Thread.sleep(3000);
		// to click on the fifth suggestion
		sugg.get(4).click();
		Thread.sleep(3000);
		// to navigate to back
		dr.navigate().back();
		Thread.sleep(3000);
		// to close the browser 
		dr.quit();
	}

}
