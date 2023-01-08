package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P05_ShoesPage {

    public WebElement redColorCheckbox()
    {
        return Hooks.driver.findElement(By.id("attribute-option-15"));
    }
    public WebElement redColorShoe()
    {
        return Hooks.driver.findElement(By.xpath(".//div[@class=\"product-grid\"]//a[@title=\"Show details for adidas Consortium Campus 80s Running Shoes\"]"));
    }
}
