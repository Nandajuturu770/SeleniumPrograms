package webdrive_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverMethod {
	public static void main(String[] args) {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to maximize the browser
		dr.manage().window().maximize();
		// to syncronization
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url and click
		dr.get("https://web.whatsapp.com/");
		// to navigate from the this another application
		dr.navigate().to("https://www.facebook.com/");
		// to get the current url
		System.out.println(dr.getCurrentUrl());
		// to get title of the web page 
		System.out.println(dr.getTitle());
		// to get page source
		System.out.println(dr.getPageSource());
		// to find the element 
		By a = By.id("Nanda");
		WebElement we = dr.findElement(a);
		// to select class 
		Select s = new Select(we);
		WebElement se = s.getWrappedElement();
		String str = se.getText();
		// to display the all the options 
		System.out.println(str);
		// to close the brower
		dr.close();
	} 
}
