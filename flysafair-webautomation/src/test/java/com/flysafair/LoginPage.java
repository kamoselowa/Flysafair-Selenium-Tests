package com.flysafair;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    private WebDriver driver;

    @BeforeEach
    public void Setup() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\kamo's hunny\\Desktop\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.flysafair.co.za/");

    }

    @Test
    public void FirstPage() {
        WebElement NavbarAssertion = driver.findElement(By.xpath("/html/body/div[1]/nav"));
        NavbarAssertion.isDisplayed();

    }

    @AfterEach
    public void TearDown() {
        if (driver != null) {
            driver.quit();
            ;
        }
    }
}
