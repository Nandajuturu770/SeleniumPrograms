package handling_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to call the method
		fileUploadPopup(dr);

	}

	public static void fileUploadPopup(WebDriver dr) throws InterruptedException {
		// to maximize the browser
		dr.manage().window().maximize();
		// to synchronization
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url 
		dr.get("file:///C:/FireFlinkClient/Naukari.html");
		Thread.sleep(2000);
		dr.findElement(By.id("cv")).sendKeys("C:\\Users\\JUTURU NANDAKIRAN\\Downloads\\DT20222862344_Application (1).pdf");

	}

}
