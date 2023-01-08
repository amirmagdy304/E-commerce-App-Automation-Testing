package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P04_SearchPage {

    public WebElement searchTXT()
    {
        return Hooks.driver.findElement(By.id("FirstName"));
    }
    public WebElement apparelTag()
    {
        return Hooks.driver.findElement(By.xpath("//div[@class=\"tags\"]//a[@href=\"/apparel-2\"]"));
    }
    public WebElement cameraTag()
    {
        return Hooks.driver.findElement(By.xpath("//div[@class=\"tags\"]//a[@href=\"/camera\"]"));
    }
    public WebElement itemsPageTitle()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }
    public WebElement addingSuccessfulMessage()
    {
        return Hooks.driver.findElement(By.className("content"));
    }

    public WebElement addToCartByItemID(String itemID)
    {
        return Hooks.driver.findElement(By.xpath("//div[@data-productid='"
                +itemID
                +"']//button[text()='Add to cart']"));
    }
    public WebElement addToWishlistByItemID(String itemID)
    {
        return Hooks.driver.findElement(By.xpath("//div[@data-productid='"
                +itemID
                +"']//button[text()='Add to wishlist']"));
    }
}
