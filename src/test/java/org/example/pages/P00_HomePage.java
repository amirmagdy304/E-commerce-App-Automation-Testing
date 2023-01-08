package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P00_HomePage {

    public String homePageURL = "https://demo.nopcommerce.com/";
    public void navigateToHomePage()
    {
        Hooks.driver.navigate().to(homePageURL);
    }
    public WebElement searchTXT()
    {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }
    public WebElement searchBTN()
    {
        return Hooks.driver.findElement(By.cssSelector("button[type=\"submit\"]"));
    }
    public WebElement EuroCurrency()
    {
        return Hooks.driver.findElement(By.xpath("//*[@id=\"customerCurrency\"]/option[2]"));
    }
    public WebElement apparelBTN()
    {
        return Hooks.driver.findElement(By.xpath(".//ul[@class=\"top-menu notmobile\"]//a[@href=\"/apparel\"]"));
    }
    public WebElement shoesSubCategory()
    {
        return Hooks.driver.findElement(By.xpath(".//ul[@class=\"top-menu notmobile\"]//a[@href=\"/shoes\"]"));
    }

}