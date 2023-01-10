package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P06_CartPage {

    public WebElement agreeTermsCheckbox()
    {
        return Hooks.driver.findElement(By.id("termsofservice"));
    }
    public WebElement checkoutBTN()
    {
        return Hooks.driver.findElement(By.id("checkout"));
    }
}
