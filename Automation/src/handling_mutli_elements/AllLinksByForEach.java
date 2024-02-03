
/* TO PRINT ALL THE LINKS PRESENTED IN AN APPLICATION WITH HELP FRO EACH LOOP*/

package handling_mutli_elements;

import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksByForEach {

	public static void main(String[] args) throws InterruptedException {
		
		// to read url from user 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter you url to get all links :");
		String url = sc.nextLine();
		// to open the Browser
		WebDriver dr = new ChromeDriver();
		// to call the method by using method signature
		allLinksByForEach(dr, url);

	}
	public static void allLinksByForEach(WebDriver dr , String url) throws InterruptedException {

		// to maximize
		dr.manage().window().maximize();
		// to sleep 
		Thread.sleep(2000);
		// to enter url
		dr.get(url);
		Thread.sleep(2000);
		// to find the element
		List<WebElement> elements = dr.findElements(By.xpath("//a"));
		// size of list 
		int size = elements.size();
		System.out.println(size);
		// to print the all texts of links by using for each loop
		for(WebElement wb : elements ) {
			System.out.println(wb);
		}
		// to close 
		dr.quit();

	}
	
}
