package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_PasswordRecoveryPage {
    public WebElement recoveryEmailTXT()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement recoveryBTN()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"buttons\"] > button[type=\"submit\"]"));
    }
}
