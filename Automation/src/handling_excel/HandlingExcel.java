package handling_excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingExcel {

	FileInputStream fis;
	FileOutputStream fos;
	Workbook workbook;
	Sheet sheet;
	String sheetAddress;

	public HandlingExcel(String sheetAddress, String sheetName) {
		try {
			this.sheetAddress = sheetAddress;
			this.fis = new FileInputStream(sheetAddress);
			this.workbook = WorkbookFactory.create(fis);
			this.sheet = workbook.getSheet(sheetName);
		}catch (Exception exception) {
			System.out.println("file is not found "+sheetAddress+" pleaese check below details :: \n"+exception.getMessage());
		}
	}

	/**
	 * @description this method is used to get the cell value
	 * @param row        <code>int</code>
	 * @return cellValue <code>String</code>
	 */
	public String getCellvalue(int row , int colunm) {
		return sheet.getRow(row).getCell(colunm).getStringCellValue();

	}

	/**
	 * @desctiption this method is used to get last row number.
	 * @return lastRowNumber <code>int</code>
	 */
	public int getLastRowNumber() {
		return sheet.getLastRowNum();
	}

	/**
	 * @description this methos is used to get last column of any row.
	 * @param row               <code>int</code>
	 * @return lastColumnNumber <code>int</code>
	 */
	public int getLastColounNumber(int row) {
		return sheet.getRow(row).getLastCellNum();
	}

	/**
	 * @description this method is used to set cell value.
	 * @param row    <code>int</code>
	 * @param column <code>int</code>
	 * @param value  <code>String</code>
	 */
	public void setCellValue(int row, int column, String value) {
		sheet.getRow(row).getCell(column).setCellValue(value);
		try {
			fos = new FileOutputStream(this.sheetAddress);
			workbook.write(fos);
		} catch (Exception exception) {
			System.out.println("set cell value is not happened, please check below details ::\n"+exception.getMessage());
		}


	}

	/**
	 * @description this method to used to test login account of actiTime.
	 * @param username <code>String</code>
	 * @param password <code>String</code>
	 */
	public static void tocheck(String un, String pw) {
		// set browser
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// navigate to ursl
		dr.get("https://online.actitime.com/login");
		// find the element and enter the data into it 
		dr.findElement(By.name("username")).sendKeys(un);
		dr.findElement(By.name("pwd")).sendKeys(pw);
		// find the elemtn and click on it
		dr.findElement(By.xpath("//div[text()='Login ']")).click();
		// to find the element and checking 
		boolean check = dr.findElement(By.xpath("//span[.='Username or Password is invalid. Please try again.']")).isDisplayed();
		if(check == true)
			System.out.println(un+ " or "+ pw +" are wrong please enter valid data :");
		else
			System.out.println(un+" and "+pw+" are the right you loged in successfully ");
		dr.quit();	
	}	

	/**
	 * @descrition this is main method.
	 * @param args <code>String[]</code>
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// shet details
		String sheetAdress = "./data/actiTimeUsers.xlsx";
		String sheetName = "customerlogin";
		HandlingExcel handlingExcel = new HandlingExcel(sheetAdress, sheetName);
		// varification
		int lastRownumber = handlingExcel.getLastRowNumber();
		for(int i= 0 ; i <= lastRownumber; i++ ) {
			int lastCoulumNumber = handlingExcel.getLastColounNumber(i);
			for (int j = 0; j < lastCoulumNumber ; j++) {
				System.out.print(handlingExcel.getCellvalue(i, j) + "  ");
			}
			System.out.println();
		}
		for(int i = 0 ; i < lastRownumber; i++) {
			System.out.println(handlingExcel.getCellvalue(i,0 ));
		}
		handlingExcel.setCellValue(1, 0, "admin");
		handlingExcel.setCellValue(1, 1, "manager");
		String username = handlingExcel.getCellvalue(1, 0);
		String password = handlingExcel.getCellvalue(1, 1);
		System.out.println(username+"/t"+password);
		tocheck(username, password);
	}
}
