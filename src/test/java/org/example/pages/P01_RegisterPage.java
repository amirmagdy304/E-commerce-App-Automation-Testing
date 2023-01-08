package org.example.pages;

import org.example.stepDefs.Hooks;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_RegisterPage {

    public WebElement maleGenderRadio()
    {
        return Hooks.driver.findElement(By.id("gender-male"));
    }
    public WebElement femaleGenderRadio()
    {
        return Hooks.driver.findElement(By.id("gender-female"));
    }
    public WebElement firstNameTXT()
    {
        return Hooks.driver.findElement(By.id("FirstName"));
    }
    public WebElement lastNameTXT()
    {
        return Hooks.driver.findElement(By.id("LastName"));
    }
    public WebElement dateOfBirthDayDropDown()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }
    public WebElement dateOfBirthMonthDropDown()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }
    public WebElement dateOfBirthYearDropDown()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }
    public WebElement emailTXT()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement companyTXT()
    {
        return Hooks.driver.findElement(By.id("Company"));
    }
    public WebElement newsletterCheckBox()
    {
        return Hooks.driver.findElement(By.id("Newsletter"));
    }
    public WebElement passwordTXT()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement confirmPasswordTXT()
    {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement registerBTN()
    {
        return Hooks.driver.findElement(By.id("register-button"));
    }
    public WebElement continueBTN()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"buttons\"] > a"));
    }
}
