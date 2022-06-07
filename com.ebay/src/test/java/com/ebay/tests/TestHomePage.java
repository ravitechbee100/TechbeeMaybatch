package com.ebay.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ebay.base.BasePage;
import com.ebay.base.pages.HomePage;

public class TestHomePage {
	WebDriver driver;
	Properties pros;
	BasePage basePage;
	HomePage homePage;

	@BeforeTest(alwaysRun = true)
	public void setUp() {
		basePage = new BasePage();
		pros = basePage.init_Properties();
		driver = basePage.init_Driver(pros);
		homePage = new HomePage(driver);

	}

	@Test(priority = 1)
	public void verifyTitle() {

		String actualTitle = homePage.verifyTitle();
		String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 2)
	public void electronicSelectionTest() throws InterruptedException {

		String actualElectronics = homePage.electronicSelection();
		Thread.sleep(2000);
		String expectedElectronics = "Electronics";
		Assert.assertEquals(actualElectronics, expectedElectronics);

	}

	@Test(priority = 3)
	public void searchItemTest() throws InterruptedException {
		homePage.searchItem();
	}

	@AfterTest(groups = { "tearDown" })
	public void tearDown() {
		driver.quit();
	}

}
