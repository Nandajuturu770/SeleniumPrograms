package handlingPropetiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate {
	public static void main(String[] args) throws IOException, InterruptedException {
		// to create file input strean
		FileInputStream fis = new FileInputStream("./data/commandata.property");
		Properties p = new Properties();
		p.load(fis);
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to call the method
		automate(dr,p);
	}
	public static void automate(WebDriver dr , Properties p ) throws InterruptedException {
		// to maximize   
		dr.manage().window().maximize();
		// to syncronization
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url from the Property
		dr.get(p.getProperty("url"));
		// to send the data to text element 
		dr.findElement(By.name("username")).sendKeys(p.getProperty("un"));
		// to send the data to text field element
		dr.findElement(By.name("pwd")).sendKeys(p.getProperty("pw"));
		// to wait 
		Thread.sleep(2000);
		// to click the button
		dr.findElement(By.xpath("//div[text()='Login ']")).click();
		// to clase the browser
		dr.quit();
	}
}
