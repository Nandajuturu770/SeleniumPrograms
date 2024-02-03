package handling_windows;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CloseSpecific {
	public static void main(String[] args) {
		// to read the data from the user
		Scanner s = new Scanner( System.in);
		System.out.println("please enter to close the specific browser ");
		String b = s.next();
		// to open the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url
		driver.get("https://secure.indeed.com/");
		// to click on the element
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> wid = driver.getWindowHandles();
		for (String id : wid) {
			driver.switchTo().window(id);
			String str = driver.getTitle();
			//System.out.println(str);
			if(
					str.contains(b)) {
				driver.close();
			}
        
		}

	}
}
