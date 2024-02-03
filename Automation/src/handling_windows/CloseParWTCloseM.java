package handling_windows;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParWTCloseM {

	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to call the method
		closeParWTCloseM(dr);
	}

	public static void closeParWTCloseM(WebDriver dr) throws InterruptedException {
		// to maximize 
		dr.manage().window().maximize();
		// to synchronisation
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url
		dr.get("https://secure.indeed.com/");
		String paremtTitle = dr.getTitle();
		// to find the element and click on it 
		dr.findElement(By.id("login-google-button")).click();
		dr.findElement(By.id("apple-signin-button")).click();
		// to get window handles 
		Set<String> allWhs = dr.getWindowHandles();
		for (String wh : allWhs) {
			// the controller switch to browser
			dr.switchTo().window(wh);
			// to clise the only parent browser
			if(dr.getTitle().equals(paremtTitle)) {
				dr.close();
			}
		}
//		Thread.sleep(5);
//		dr.quit();
	}
}
