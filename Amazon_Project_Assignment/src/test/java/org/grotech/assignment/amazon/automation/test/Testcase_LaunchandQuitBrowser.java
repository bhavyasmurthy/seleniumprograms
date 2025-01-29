package org.grotech.assignment.amazon.automation.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class Testcase_LaunchandQuitBrowser {

	public static WebDriver driver;

	@DataProvider(name = "login data")
	public String[][] login_details() throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream("DDT\\bhavyasm.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		// step3: give the sheet name where the details are present
		Sheet s1 = w1.getSheet("login_data");
		int rowsize = s1.getLastRowNum();
		int columnsize = 2;
		System.out.println("row size " + rowsize);
		String[][] data = new String[rowsize][columnsize];
		for (int i = 0; i < rowsize; i++) {
			System.out.println("Entering the loop " + i);
			Row r1 = s1.getRow(i);
			for (int j = 0; j < columnsize; j++) {
				if (r1.getCell(j) == null) {
					continue;
				}
				if (CellType.NUMERIC == r1.getCell(j).getCellType()) {
					data[i][j] = String.valueOf(r1.getCell(j).getNumericCellValue());
				} else {
					data[i][j] = r1.getCell(j).getStringCellValue();
				}
			}
		}
		return data;
	}

	@BeforeMethod
	public void launch() {
		driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
