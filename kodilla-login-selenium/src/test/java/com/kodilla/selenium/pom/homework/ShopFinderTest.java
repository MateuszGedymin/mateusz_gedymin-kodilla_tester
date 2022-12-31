package com.kodilla.selenium.pom.homework;

import com.kodilla.selenium.pom.KodillaLoginPom;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class ShopFinderTest {


    ShopFinder shopFinder;


    @BeforeEach
    public void setup() {
        shopFinder = new ShopFinder();
    }

    @Test
    void findByWordNoteBook() {
        shopFinder.finder("NoteBook");

        Assertions.assertEquals(2, shopFinder.getAmount());
    }

    @Test
    public void findByWordSchool() {
        shopFinder.finder("School");

        Assertions.assertEquals(1, shopFinder.getAmount());
    }

    @Test
    public void findByWordBrand() {
        shopFinder.finder("Brand");

        Assertions.assertEquals(1, shopFinder.getAmount());
    }

    @Test
    public void findByWordBusiness() {
        shopFinder.finder("Business");

        Assertions.assertEquals(0, shopFinder.getAmount());
    }

    @Test
    public void findByWordGaming() {
        shopFinder.finder("Gaming");

        Assertions.assertEquals(1, shopFinder.getAmount());
    }

    @Test
    public void findByWordPowerful() {
        shopFinder.finder("Powerful");

        Assertions.assertEquals(0, shopFinder.getAmount());
    }

    @AfterEach
    public void testDown() {
        shopFinder.close();
    }
}