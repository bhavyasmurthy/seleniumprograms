package org.grotech.assignment.amazon.pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTforloop {
	@DataProvider(name = "login data")
	public Object[][] login_details() throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\mruty\\eclipse-workspace\\SeleniumProgramming\\ExcelSheet\\bhavyasm.xlsx");
		// step2: open the file with the help of a create method of class
		// workbookfactory
		Workbook w1 = WorkbookFactory.create(f1);
		// step3: give the sheet name where the details are present
		Sheet s1 = w1.getSheet("login_data");
		int rowsize = s1.getLastRowNum() + 1;
		int columnsize = 2;
		System.out.println("Last row numbers " + rowsize);
		Object[][] data = new Object[rowsize][columnsize];
		for (int i = 0; i < rowsize; i++) {
			Row r1 = s1.getRow(i);
			for (int j = 0; j < columnsize; j++) {
				if (r1.getCell(j) == null) {
					continue;
				}

				if (CellType.NUMERIC == r1.getCell(j).getCellType()) {
					data[i][j] = r1.getCell(j).getNumericCellValue();
				} else {
					data[i][j] = r1.getCell(j).getStringCellValue();

				}
				System.out.println(data[i][j]);
			}

		}
		return data;
	}

	@Test(dataProvider = "login data")
	public void testcase(Object username, Object password) {
		EdgeDriver driver = new EdgeDriver();
		driver.get(
				"https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0\r\n");
		WebElement name = driver.findElement(By.id("ap_customer_name"));
		name.sendKeys(String.valueOf(username));
		WebElement phno = driver.findElement(By.id("ap_phone_number"));
		phno.sendKeys("9611700318");
		WebElement pwd = driver.findElement(By.id("ap_password"));
		pwd.sendKeys(String.valueOf(password));
		WebElement button = driver.findElement(By.id("continue"));
		button.click();
		driver.quit();

	}

}
