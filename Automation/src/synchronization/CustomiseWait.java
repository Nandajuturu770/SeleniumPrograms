package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomiseWait {
	public static void main(String[] args) {
		// to enter url 
		WebDriver dr = new ChromeDriver();
		// to call the method 
		customiseWait(dr);
	}

	public static void customiseWait(WebDriver dr) {
		// to maximize
		dr.manage().window().maximize();
		// to enter url
		dr.get("https://chat.qspiders.com/");
		// to find the element on web page and enter the input into it
		dr.findElement(By.name("username")).sendKeys("nandajuturu@gmail.com");
		dr.findElement(By.name("password")).sendKeys("Nandajuturu#770");
		// to login 
		dr.findElement(By.xpath("//button[.='Login']")).submit();
		// to find the element by using customize wait
		for(int i = 1 ; i>0 ; i++) {
			// to throws the exception
			try {
				// to click on the logout button {here it is abnormal statement}
				dr.findElement(By.xpath("//button[.='logout']")).click();
				//System.out.println("hi");
				i = -100;
			}
			// to catch the exception
			catch(Exception e) {
				//System.out.println("bye");
			}
		}
		// to click on okay button
		dr.findElement(By.xpath("//button[text() = 'Ok']")).click();
		// to close the browser
		dr.quit();
	}
}
