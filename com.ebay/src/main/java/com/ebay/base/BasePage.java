package com.ebay.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	WebDriver driver;
	Properties pros;

	public WebDriver init_Driver(Properties pros) {
		String browser = pros.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("browser name not found !");
		}
		driver.get(pros.getProperty("url"));
		driver.manage().deleteAllCookies();
		return driver;
	}

	public Properties init_Properties() {
		pros = new Properties();
		String configPathString = "/Users/amirouchemadaoui/Documents/eclipse/com.ebay/src/main/java/com/ebay/base/config/config.properties";
		try {
			FileInputStream file = new FileInputStream(configPathString);
			pros.load(file);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pros;
	}
}