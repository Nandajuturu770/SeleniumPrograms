package list_box;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSearch {
	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("please enter ele to search : ");
    String ele = in.next();
    WebDriver dr = new ChromeDriver();
    // to call the method
    boolean b = toSearch(dr , ele);
    if(b==true)
    	System.out.println("your element "+ ele + " is present ");
    else
    	System.out.println("your element "+ ele + " is not present ");
	}

	public static boolean toSearch(WebDriver dr, String ele) {
		// to verify 
		boolean b = false ;
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.get("file:///D:/fireflink/Food.html");
		WebElement we = dr.findElement(By.id("bf"));
		Select s = new Select(we);
		// to ger all the options 
		List<WebElement> allwe = s.getOptions();
		for (int i = 0; i < allwe.size(); i++) {
			String str = allwe.get(i).getText();
			if(str.equalsIgnoreCase(ele)) {
				b=true ;
				break ;
			}
		}
		// to close the browser
		dr.close();
		return b;
	}
}
