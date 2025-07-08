package handling_excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// to create an object for file input stream 
		FileInputStream fis=new FileInputStream("./data/fireflink users.xlsx");
		// to call method create() of workbookfactory it will returns the workbook
		Workbook wb = WorkbookFactory.create(fis);
		// to get the data from the sheet 
		String data = wb.getSheet("Nanda").getRow(2).getCell(0).getStringCellValue();
		// to print the data value on the console
		System.out.println(data);

	}

}
