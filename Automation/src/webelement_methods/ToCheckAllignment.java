
/*to verify that the alignment of radio button of face book is properly placed or not*/

package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckAllignment {
	public static void main(String[] args) throws InterruptedException {
		// to open browser
		WebDriver dr1 = new ChromeDriver();
		toCheckAllignment(dr1);
	}
	public static void toCheckAllignment(WebDriver dr) throws InterruptedException{
		 // to maximize 
		dr.manage().window().maximize();
		// to sleep 
		Thread.sleep(2000);
		// to enter url 
		dr.get("https://www.facebook.com/");
		// to find the element and click
		dr.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		//to find the element and get y axis values 
        int f = dr.findElement(By.xpath("//label[.='Female']")).getLocation().getY();
        int m = dr.findElement(By.xpath("//label[.='Male']")).getLocation().getY();
        int c = dr.findElement(By.xpath("//label[.='Custom']")).getLocation().getY();
        // to verify the alignment
        if(f==m && m==c)
        	System.out.println("All the radio buttons are properly aligned \"PASSED\"");
        else
        	System.out.println("All the radio buttons are NOT properly aligned \"FAILED\"");
        // to close browser
        dr.quit();
	}
}
