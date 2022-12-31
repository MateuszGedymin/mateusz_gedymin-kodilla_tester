package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShopFinder {
    @FindBy(name = "search")
     WebElement searchField;

    By searchWrapper = By.className("element");

     WebDriver driver;
    public ShopFinder() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\XXX123\\IdeaProjects\\kodilla-course\\kodilla-login-selenium\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        PageFactory.initElements(driver, this);
        driver.navigate().to("https://kodilla.com/pl/test/store");

    }

    public void finder(String find) {
        searchField.sendKeys(find);
    }

    public int getAmount() {
        List<WebElement> list = driver.findElements(searchWrapper);
        int howManyElements = list.size();
        //System.out.println("There are " + howManyElements + " results!");
        return howManyElements;
    }

    public void close() {
        driver.close();
    }

}
