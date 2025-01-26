package excelsheetdataassignments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

//"Assignment 172
//Write a program to fetch the data (logindetails)from excel sheet using NumberToTextConveter"
public class Assignment172 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\mruty\\OneDrive\\Desktop\\githubforjava\\seleniumprograms\\Selenium_Assignments\\DataDrivenTest\\Datadriventesting.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String numbers = NumberToTextConverter
				.toText(w1.getSheet("logindetails").getRow(4).getCell(0).getNumericCellValue());
		System.out.println(numbers);
	}

}
