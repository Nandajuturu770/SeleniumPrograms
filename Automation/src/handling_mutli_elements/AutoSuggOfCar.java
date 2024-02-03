package handling_mutli_elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggOfCar {

	public static void main(String[] args) {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to call the method
		autoSuggOfCar(dr);
	}

	public static void autoSuggOfCar(WebDriver dr) {
		// to maximize the browser
		dr.manage().window().maximize();
		// to enter the url
		dr.get("https://www.amazon.com/");
		// to synchronisation
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to find the element and enter the data
		dr.findElement(By.id("twotabsearchtextbox")).sendKeys("car");
		// to get all element of suggestion
		List<WebElement> allSug = dr.findElements(By.xpath("//div[@class = 's-suggestion-container']"));
		for (WebElement we : allSug) {
			System.out.println(we.getText());
		}
		// to close the broser
		dr.quit();
	}

}
