package handling_windows;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWTSpecific {
	public static void main(String[] args) {
		// to read the value from the user
		Scanner sc = new Scanner(System.in);
		// to display proper msg to user 
		System.out.println("enter your browser which want to be not be close :");
		// to open the browser 
		WebDriver dr = new ChromeDriver();
		// to call the method
		closeWTSpecific(dr,sc.nextLine());
	}

	public static void closeWTSpecific(WebDriver dr , String ele) {
		// to maximize 
		dr.manage().window().maximize();
		// to synchronisation
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url
		dr.get("https://secure.indeed.com/");
		// to find the element and click on it 
		dr.findElement(By.id("login-google-button")).click();
		dr.findElement(By.id("apple-signin-button")).click();
		// to get window handles 
		Set<String> allWhs = dr.getWindowHandles();
		for (String wh : allWhs) {
			// the controller switch to browser
			dr.switchTo().window(wh);
			// to clise the only parent browser
			if(!dr.getTitle().contains(ele)) {
				dr.close();
			}	
		}
	}
}
