package excelsheetdataassignments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//"Assignment 171
//Write a program to fetch the data (logindetails)from excel sheet "
public class Assignment171 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\mruty\\OneDrive\\Desktop\\githubforjava\\seleniumprograms\\Selenium_Assignments\\DataDrivenTest\\Datadriventesting.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String uname = w1.getSheet("logindetails").getRow(1).getCell(0).getStringCellValue();
		System.out.println(uname);

		String pwd = w1.getSheet("logindetails").getRow(1).getCell(1).getStringCellValue();
		System.out.println(pwd);

	}

}
