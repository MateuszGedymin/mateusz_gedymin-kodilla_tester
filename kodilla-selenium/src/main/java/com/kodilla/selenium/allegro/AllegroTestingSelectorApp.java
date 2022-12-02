package com.kodilla.selenium.allegro;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Clock;
import java.time.Duration;
import java.util.List;


public class AllegroTestingSelectorApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\XXX123\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://allegro.pl/");
        JavascriptExecutor js = (JavascriptExecutor)driver;

        WebElement alert = driver.findElement(By.xpath("//*/div[2]/div/div/div[2]/div/div[2]/button[1]"));
        alert.isDisplayed();
        alert.click();


        WebElement searchBar = driver.findElement(By.cssSelector("* > header > div > div > div > div > form > input"));
        searchBar.sendKeys("Laptop");
        searchBar.submit();
        List<WebElement> elementList = driver.findElements(By.cssSelector("#search-results > div:nth-child(5) > div > div > div:nth-child(1) > div > div > section:nth-child(1) > article:nth-child(2)"));
        elementList.get(0).click();
        WebElement laptop1 = driver.findElement(By.tagName("h4"));
        System.out.println("1st laptop is " + laptop1.getText());

        driver.quit();
    }
}
