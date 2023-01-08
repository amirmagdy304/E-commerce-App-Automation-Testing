package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_LoginPage {
    public WebElement emailTXT()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement passwordTXT()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement rememberMeCheckBox()
    {
        return Hooks.driver.findElement(By.id("RememberMe"));
    }
    public WebElement forgetPasswordHref()
    {
        return Hooks.driver.findElement(By.className("forgot-password"));
    }
    public WebElement loginBTN()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"buttons\"] > button[type=\"submit\"]"));
    }
    public WebElement unsuccessfulMsg()
    {
        return Hooks.driver.findElement(By.className("message-error"));
    }
}
