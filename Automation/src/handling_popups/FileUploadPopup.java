/* FILE UPLOAD POPUPS :
 * --> we cannot inspect this popups
 * --> we can move this popups
 * --> popups having open and cancel button 
 * --> title of popup either open or file upload */
package handling_popups;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
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
		// to convert the relative path into the absolute path
		/* to ger absolute we have a non static method in side the file class
		 * so to call that method we need to create an object of file and give the parameter relative path
		 * and call the method [getAbsolutePath()] with help object reference
		 */
		File f = new File("./data/NandaResum.pdf");
		String abPath = f.getAbsolutePath();
		// to find the element and send to file
		dr.findElement(By.id("cv")).sendKeys(abPath);
		// to wait
		Thread.sleep(3000);
		// to print the absolute path
		System.out.println(abPath);
		// to close the browser
		dr.quit();
	}

}
 