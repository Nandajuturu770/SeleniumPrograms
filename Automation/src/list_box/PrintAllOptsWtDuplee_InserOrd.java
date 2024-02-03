package list_box;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptsWtDuplee_InserOrd {
	public static void main(String[] args) {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to call the method
		printAllOptsWtDuplee_InserOrd(dr);
	}
	public static void printAllOptsWtDuplee_InserOrd(WebDriver dr) {
		// to maximize
		dr.manage().window().maximize();
		// to wait
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter url
		dr.get("file:///D:/fireflink/Food.html");
		// to find element
		WebElement listWe = dr.findElement(By.id("bf"));
		// to create an object of select class 
		Select s = new Select(listWe);
		// to call the method of select class
		List<WebElement> listWes = s.getOptions();
		// to create an object of HashSet class
		Set<String> set = new HashSet<String>();
		// to print the all the element presented on list box with out duplicate value 
		for (int i = 0; i < listWes.size(); i++) {
			if(set.add(listWes.get(i).getText())==true) 
				System.out.println(listWes.get(i).getText());
		}
		// to print the all the elements which are duplicate element in list Box
		for (int i = 0; i < listWes.size(); i++) {
			if(set.add(listWes.get(i).getText())==false) 
				System.out.println(listWes.get(i).getText());
		}
		// to close the browser
		dr.quit();
	}
}
