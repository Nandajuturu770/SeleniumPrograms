/* to handling the frame we use switchTo() method*/
package frame_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	public static void main(String[] args) {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to call the method
		handlingFrames(dr);
	}

	public static void handlingFrames(WebDriver dr) {
		// to maximize the browser
		dr.manage().window().maximize();
		// to syncronization
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter url 
		dr.get("");
		// to switch frame 
		dr.switchTo().frame(0);
		// to find the element and enter the data
		dr.findElement(By.id("")).sendKeys("");
		// to switch the parent frame
		dr.switchTo().parentFrame();
		// to fid the element and enter the data


	}
}
