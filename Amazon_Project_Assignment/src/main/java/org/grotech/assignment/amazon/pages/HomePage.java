package org.grotech.assignment.amazon.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private Actions actions;

	public HomePage(WebDriver driver) {
		actions = new Actions(driver);
		PageFactory.initElements(driver, this);
	}

	// for register
	@FindBy(linkText = "Start here.")
	private WebElement registerlink;

	// step 1
	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	private WebElement accountandlist_hoverover;

	// for valid credentials
	@FindBy(xpath = ("(//span[.='Sign in'])[1]"))
	private WebElement signin_home;

	@FindBy(xpath = "//button[@class='sc-fqkvVR sc-fTFjTM jZunJN eqmAHp']")
	WebElement manageprofileslink;

	// product search
	@FindBy(id = "twotabsearchtextbox")
	WebElement productsearch;

	// hoveroveracctsandlistsclickyourorders
	@FindBy(xpath = "//a[@id='nav_prefetch_yourorders']")
	WebElement yourorderslink;

	// hoveroverreturnandordersandclick
	@FindBy(xpath = "(//span[@class='nav-line-2'])[2]")
	WebElement returnsandorders;

	public void hoveroverToAccountAndList() {
		actions.moveToElement(accountandlist_hoverover).perform();
	}

	public void clickresgister() {
		registerlink.click();
	}

	// for login valid credntials
	public void signin() {
		actions.moveToElement(signin_home).perform();
		actions.click().perform();
	}

	// for manage profile testcase3
	public void clickonprofiles() {
		manageprofileslink.click();
	}

	// to search a product
	public void searchproduct(String searchproduct) {
		productsearch.sendKeys(searchproduct + Keys.ENTER);
	}

	// to clear search field
	public void clearsearchfield() {
		productsearch.clear();
	}

//	public void sortbynewerstarrival() {
//		Select select = new Select(sortbyfeaturedropdown);
//		select.selectByIndex(4);
//	}

	// for your orders in hoverover
	public void clickyourorders() {
		yourorderslink.click();
//		actions.moveToElement(yourorderslink).perform();
//		actions.click().perform();

	}

	// for hoverover retrnsand orders next to acctsand list
	public void returnsandorders() {
		actions.moveToElement(returnsandorders).perform();
		actions.click().perform();

	}

}
