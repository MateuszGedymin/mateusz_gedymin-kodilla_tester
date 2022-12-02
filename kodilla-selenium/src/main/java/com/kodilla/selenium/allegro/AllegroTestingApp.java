package com.kodilla.selenium.allegro;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\XXX123\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement alert = driver.findElement(By.xpath("//*/div[2]/div/div/div[2]/div/div[2]/button[1]"));
        alert.click();

        WebElement searchBar = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[3]/header/div/div/div/div/form/input"));
        searchBar.sendKeys("Mavic mini");
        WebElement searchDropdown = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[3]/header/div/div/div/div/form/div[3]/div/select"));
        Select searchType = new Select(searchDropdown);
        searchType.selectByVisibleText("Elektronika");
        searchBar.submit();

    }
}
