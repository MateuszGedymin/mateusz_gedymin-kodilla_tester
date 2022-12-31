package com.kodilla.selenium.pom.homework;

import com.kodilla.selenium.pom.KodillaLoginPom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopFinderApplication {

    public static void main(String[] args) {
        ShopFinder shopFinder = new ShopFinder();
        shopFinder.finder("NoteBook");
        shopFinder.getAmount();
        shopFinder.close();
    }
}
