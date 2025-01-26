package org.grotech.assignment.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterpPage {
	private Actions actions;

	public FilterpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "button[@id='a-autoid-410-announce']")
	//
	// "(//span[.='12'])[2]")
	WebElement productsize;

	@FindBy(xpath = "(//input[@type='checkbox'])[5]")
	WebElement selectproductchecbox;

	// menshoesize
	public void selectproductsize(WebDriver driver) {
		actions = new Actions(driver);
		actions.click(productsize).perform();
	}

	@FindBy(xpath = "(//div[@class='colorsprite aok-float-left'])[3]")
	WebElement productcolor;

	public void selectproduct1checkbox(WebDriver driver) {
		actions = new Actions(driver);
		actions.click(selectproductchecbox).perform();

	}

	public void chooseproductcolor(WebDriver driver) {
		actions = new Actions(driver);
		actions.click(productcolor).perform();
	}

}
