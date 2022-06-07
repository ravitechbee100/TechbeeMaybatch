package com.ebay.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ebay.base.BasePage;
import com.ebay.base.pages.HomePage;
import com.ebay.base.pages.LoginPage;

public class LoginPageTest {
	WebDriver driver;
	Properties pros;
	BasePage basePage;
	LoginPage loginPage;
	HomePage homePage;

	@BeforeTest(alwaysRun = true)
	public void setUp() {
		basePage = new BasePage();
		pros = basePage.init_Properties();
		driver = basePage.init_Driver(pros);
		loginPage = new LoginPage(driver);

	}

	@Test(priority = 1)
	public void LoginPageTest() throws InterruptedException {
		loginPage.doLoginPage();
		Thread.sleep(5000);
	}

	@AfterTest(groups = { "tearDown" })
	public void tearDown() {
		driver.quit();
	}

}
