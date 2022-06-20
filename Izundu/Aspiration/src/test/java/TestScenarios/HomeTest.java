package TestScenarios;

import Objects.Home;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomeTest {
    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://aspiration.com/");
    }

    @Test
    public void SpendSave(){
        Home page = new Home(driver);
        page.clickSpendSave();
    }

    @Test
    public void GetStarted(){
        Home page = new Home(driver);
        page.getStarted();
    }

    @Test
    public void MonthlyPrice(){
        Home page = new Home(driver);
        page.clickSpendSave();
        String monthly = page.monthly();
        String monthlyAnnual = page.monthlyAnnual();
        Assert.assertTrue(monthly.contains("$7.99"));
        Assert.assertTrue(monthlyAnnual.contains("$5.99"));
    }

    @Test
    public void UnChecked(){
        Home page = new Home(driver);
        page.clickSpendSave();
        int x = page.AutoOffset();
        //if x==1 the div has no child elements and there is no checked image in it
        Assert.assertTrue(x ==1);
        x = page.OONetwork();
        Assert.assertTrue(x ==1);
        x = page.PurcAssurance();
        Assert.assertTrue(x ==1);
    }


    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}