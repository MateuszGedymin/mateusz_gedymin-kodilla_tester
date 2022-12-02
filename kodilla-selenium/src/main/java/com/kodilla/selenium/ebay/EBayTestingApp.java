package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\XXX123\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.ebay.com/");

        WebElement input = webDriver.findElement(By.name("_nkw"));
        input.sendKeys("Laptop");
        input.submit();
    }
}
