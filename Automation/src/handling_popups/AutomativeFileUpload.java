package handling_popups;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AutomativeFileUpload {
	@Test
	public  void nanda() throws InterruptedException {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to call the method
		automativeFileUpload(dr);
	}

	public static void automativeFileUpload(WebDriver dr) throws InterruptedException {
		// to maximize
		dr.manage().window().maximize();
		// to synchronization
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url
		dr.get("https://demoapps.qspiders.com/");
		// to find the element 
		dr.findElement(By.xpath("//section[.='Popups']")).click();
		// to find the element
		dr.findElement(By.xpath("//section[.='File Uploads']")).click();
		// to change the relative path into absolute path
		File f = new File("./data/NandaResum.pdf");
		String abPath = f.getAbsolutePath();
		// to find the element
		dr.findElement(By.id("fileInput")).sendKeys(abPath);
		// to display on report
		Reporter.log("file is successfully uploaded",true);
		// to wait 
		Thread.sleep(2000);
		dr.quit();

	}
}
