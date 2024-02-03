package with_encapsulation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemoTest {
	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.get("http://localhost/login.do");
		LoginDemo ld = new LoginDemo(dr);
		ld.setValues("admin", "manager");
	}
}
