
/* TO PRINT THE ALL LINK OF AN APPLICATION BY USING ++fingElements()++ METHOD */

package handling_mutli_elements;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {
	public static void main(String[] args) throws InterruptedException {
		
		// to read the url from the user 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your url to ger all links of an application : ");
		String url = sc.nextLine();
		// to open the Browser
		WebDriver dr = new ChromeDriver();
		// to call the method by using method signature
		printAllLinks(dr, url);
		
	}
	public static void printAllLinks(WebDriver dr , String url) throws InterruptedException {
		
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
		// to the all text of links 
		for(int i = 0 ; i < size ; i++ ) {
			System.out.println(elements.get(i).getText());
		}
		// to close 
		dr.quit();
		
	}
	

}
