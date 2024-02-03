package HandlingMouseAction;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRigthClick {
public static void main(String[] args) {
	// to open the browser
	WebDriver dr = new ChromeDriver();
	// to call the method
	handlingRigthClick(dr);
}

public static void handlingRigthClick(WebDriver dr) {
    // to maximize the browser
	dr.manage().window().maximize();
	// to syncronization
	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	// to enter the url
	dr.get("");
}
}
