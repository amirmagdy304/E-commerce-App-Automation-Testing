package org.example.stepDefs;

import org.example.pages.*;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;

    @Before public static void OpenBrowser()
    {
        P00_HomePage homePage = new P00_HomePage();
        // 1- Bridge
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        // 2- create object from Chrome browser
        driver = new ChromeDriver();
        //3- Configurations
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 4- navigate to url
        homePage.navigateToHomePage();
    }

    @After
    public static void quitDriver() throws InterruptedException
    {
        Thread.sleep(3000);
        driver.quit();
    }
}
