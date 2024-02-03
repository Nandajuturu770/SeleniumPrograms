
/* to open , enter the url and close browser */

package webelement_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		// to open browser 
		ChromeDriver d =new ChromeDriver();
		// to enter the url 
		d.get("https://www.whatsapp.com");
		// to get title 
		String title = d.getTitle();
		// to print the title on console 
		System.out.println(title);
		// to close the browser
		d.quit();
		
	}

	
}
