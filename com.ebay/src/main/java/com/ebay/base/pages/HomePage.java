package com.ebay.base.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ebay.base.utils.ElementUtil;

public class HomePage {
	WebDriver driver;
	ElementUtil elementUtil;

	By shopByCategory = By.id("gh-shop-a");

	By Electro = By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[2]/h3[1]/a");
	By payload = By.xpath("//input[@id='gh-ac']");
	By iphonesBy = By.xpath("//*[@id=\"srp-river-results\"]/ul");

	// Constructor
	public HomePage(WebDriver driver) {

		elementUtil = new ElementUtil(driver);
		this.driver = driver;

	}
	// Operations

	public String verifyTitle() {
		return elementUtil.doGetPageTitle();
	}

	public String electronicSelection() {
		elementUtil.doClick(shopByCategory);
		elementUtil.waitForElementVisible(Electro);
		return elementUtil.getElement(Electro).getText();

	}

	public List<WebElement> searchItem() throws InterruptedException {

		List iphones = new ArrayList<>();
		for (Object object : iphones) {
			iphones = elementUtil.getElements(iphonesBy);
		}
//		Thread.sleep(4000);
		System.out.println(iphones);
		return iphones;

	}
}
