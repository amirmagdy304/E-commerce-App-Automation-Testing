package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainToolbar {

    public WebElement currencyList()
    {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }
    public WebElement registerICO()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }
    public WebElement loginICO()
    {
        return Hooks.driver.findElement(By.className("ico-login"));
    }
    public WebElement myAccountICO()
    {
        return Hooks.driver.findElement(By.className("ico-account"));
    }
    public WebElement shoppingCartIco()
    {
        return Hooks.driver.findElement(By.className("cart-label"));
    }
    public WebElement shoppingCartQty()
    {
        return Hooks.driver.findElement(By.className("cart-qty"));
    }
    public WebElement wishListIco()
    {
        return Hooks.driver.findElement(By.className("wishlist-label"));
    }
    public WebElement wishListQty()
    {
        return Hooks.driver.findElement(By.className("wishlist-qty"));
    }
}
