package systemscenariosendtoend.Amazon_Project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_Page {
	public Registration_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ap_customer_name")
	private WebElement name;

	@FindBy(id = "ap_phone_number")
	private WebElement phoneno;

	@FindBy(id = "ap_password")
	private WebElement pwd;

	@FindBy(id = "continue")
	private WebElement continueButton;

	@FindBy(xpath = "//h1[contains(text(),'Create Account')]")
	private WebElement createaccountheader;

	public void setUsername() {
		name.sendKeys("bhavyasmurthy@gmail.com");
	}

	public void setPhoneno() {
		phoneno.sendKeys("9902825988");
	}

	public void setPassword() {
		pwd.sendKeys("Axyz@123$");
	}

	public void verifymobileno() {
		continueButton.click();
	}

	// public String getcreateaccountpageheader() {
	// return createaccountheader.getText();

	// }
	public boolean isPageDisplayed() {
		return createaccountheader.isDisplayed();
	}

	public boolean isUsernameDisplayed() {
		return name.isDisplayed();
	}

	public boolean isPasswordDisplayed() {
		return pwd.isDisplayed();
	}

}
