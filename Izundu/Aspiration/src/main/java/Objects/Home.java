package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
    WebDriver driver;

    public Home(WebDriver driver){
        this.driver= driver;
    }

    By spendsave= By.xpath("//*[@id=\"__next\"]/div/header/ul[1]/li[1]/a");
    By getstarted = By.xpath("//*[@id=\"__next\"]/div/header/ul[2]/li[2]/button");
    By monthlyannual = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/div[1]/div[2]/div[2]/p[2]");
    By monthly = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/div[1]/div[2]/div[2]/p[1]");

    By autooffset = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/ul/li[9]/div[1]/div[2]");

    By outofnetwork = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/ul/li[10]/div[1]/div[2]");

    By purchaseassurance = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/ul/li[11]/div[1]/div[2]");
    public void clickSpendSave(){
        driver.findElement(spendsave).click();
    }

    public void getStarted(){
        driver.findElement(getstarted).click();
    }
    public String monthly(){
        return driver.findElement(monthly).getText();
    }
    public String monthlyAnnual(){
        return driver.findElement(monthlyannual).getText();
    }

    public int AutoOffset(){
       return driver.findElements(autooffset).size();
    }

    public int OONetwork(){
        return driver.findElements(outofnetwork).size();
    }

    public int PurcAssurance(){
        return driver.findElements(purchaseassurance).size();
    }

}