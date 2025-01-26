package org.grotech.assignment.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrderPage {
	public OrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// orders dropdown
	@FindBy(xpath = "//select[@id='time-filter']")
	// + "//span[@id='a-autoid-1-announce']")
	// xpath = "(//span[@class='a-button-inner'])[2]"
	private WebElement previuosorderstimeline;

	public void preivousorder(int index) {
		Select select = new Select(previuosorderstimeline);
		select.selectByIndex(index);

	}

}
