package handling_excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMutlyCellValues {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// to read the data from system
		FileInputStream fis = new FileInputStream("./data/fireflink users.xlsx");
        // to load the file into wookook
		Workbook wb = WorkbookFactory.create(fis);
		// to go paricular sheet
		Sheet s = wb.getSheet("customerlogin");
		// to count the number of last row 
		int count = s.getLastRowNum();
		// to read all the data from the sheet
		for (int i = 1; i <= count; i++) {
			// to get the data from the sheet
			String un = s.getRow(i).getCell(0).getStringCellValue();
			// to get the data from the sheer
			String pw = s.getRow(i).getCell(1).getStringCellValue();
			// to displays data 
			//System.out.println(un+"\t"+pw);
			tocheck(un , pw );
		}
	}

	private static void tocheck(String un, String pw) {
		// to open the browser
		WebDriver dr = new ChromeDriver();
		// to maximize the browsee
		dr.manage().window().maximize();
		// to syncronization
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to enter the url
		dr.get("https://online.actitime.com/login");
		// to find the element and enter the data into it 
		dr.findElement(By.name("username")).sendKeys(un);
		// to find the element and enter the data into it 
		dr.findElement(By.name("pwd")).sendKeys(pw);
		// to find the element and click on the element
		dr.findElement(By.xpath("//div[text()='Login ']")).click();
		// to find the element and checking 
		boolean check = dr.findElement(By.xpath("//span[.='Username or Password is invalid. Please try again.']")).isDisplayed();
		if(check == true)
			System.out.println(un+ " or "+ pw +" are wrong please enter valid data :");
		else
			System.out.println(un+" and "+pw+" are the right you loged in successfully ");
		dr.quit();	
	}	
}
