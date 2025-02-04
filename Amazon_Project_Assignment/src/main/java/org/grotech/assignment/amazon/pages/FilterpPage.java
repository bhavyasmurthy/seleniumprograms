package org.grotech.assignment.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilterpPage {

	private WebDriver driver;
	private Actions actions;

	public FilterpPage(WebDriver driver) {
		this.driver = driver;
		this.actions = new Actions(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "p_36/range-slider_slider-item_lower-bound-slider")
	private WebElement priceRangeLowerBound;

	public void selectCategory(String category) {
		String xpath = "//span[text()=\"" + category + "\"]"; // only text changes path is dynamic
		WebElement element = driver.findElement(By.xpath(xpath));
		actions.moveToElement(element).perform();
		element.click();

//		String s = "//span[text()=\"Women's Shoes\"]";
//		String s1 = "//span[text()=\"" + category + "\"]";
//		String s3 = "a\"b\"" + category + "cd";
	}

	public void selectProductSize(int size) {
		String sizeXpath = "//button[@value='" + size + "']";
		driver.findElement(By.xpath(sizeXpath)).click();
	}

	public boolean isProductSizeselected(int size) {
		String sizeXpath = "//button[@value='" + size + "']";
		WebElement sizeElement = driver.findElement(By.xpath(sizeXpath));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(sizeElement));
		String ariapressedvalue = sizeElement.getDomAttribute("aria-pressed");
		return "true".equals(ariapressedvalue);
	}

	public boolean iscategoryheaderselected(String category) {
		String xpath = "//span[text()=\"" + category + "\"]";
		WebElement categoryElement = driver.findElement(By.xpath(xpath));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(categoryElement));
		String ariapressedvalue = categoryElement.getDomAttribute("aria-pressed");
		return "true".equals(ariapressedvalue);
	}

	public void movePriceRangeBy(int range) {
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driverWait.until(ExpectedConditions.elementToBeClickable(priceRangeLowerBound));
		actions.clickAndHold(priceRangeLowerBound).moveByOffset(range, 0).perform();
	}

}
