package dataproviderannotation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment179 {
	@DataProvider(name = "signin")
	public Object[][] signinamazon() throws EncryptedDocumentException, IOException {

		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\mruty\\eclipse-workspace\\SeleniumProgramming\\ExcelSheet\\bhavyasm.xlsx");

		Workbook w1 = WorkbookFactory.create(f1);
		Sheet s1 = w1.getSheet("login_data");

		int rowsize = s1.getLastRowNum() + 1;
		int colsize = 2;

		Object[][] d1 = new Object[rowsize][colsize];

		for (int i = 0; i < rowsize; i++) {
			Row r1 = s1.getRow(i);

			for (int j = 0; j < colsize; j++) {
				if (r1.getCell(j) == null) {
					continue;
				}
				if (CellType.NUMERIC == s1.getRow(i).getCell(j).getCellType()) {

					d1[i][j] = s1.getRow(i).getCell(j).getNumericCellValue();
				}

				else {
					d1[i][j] = s1.getRow(i).getCell(j).getStringCellValue();
				}
				System.out.println(d1[i][j]);

			}

		}

		return d1;

	}

	@Test(dataProvider = "signin")
	public void amazonSignin(Object uname, Object pswd) throws InterruptedException {
		WebDriver driver;
		driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement acctsnlists = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(acctsnlists).perform();
		a1.click();
		Thread.sleep(2000);

		WebElement sigin = driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		sigin.click();
		Thread.sleep(2000);

		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys(String.valueOf(uname));
		email.click();
		Thread.sleep(2000);

		WebElement contin = driver.findElement(By.id("continue"));
		contin.click();
		Thread.sleep(2000);

		WebElement pwd = driver.findElement(By.id("ap_password"));
		pwd.sendKeys(String.valueOf(pswd));
		pwd.click();
		Thread.sleep(2000);

		WebElement continu = driver.findElement(By.xpath("//input[@class='a-button-input']"));
		continu.click();
		Thread.sleep(2000);
		driver.quit();

	}

}
