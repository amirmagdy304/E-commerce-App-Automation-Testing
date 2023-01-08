package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.MainToolbar;
import org.example.pages.P04_SearchPage;
import org.testng.Assert;

public class D08_ShoppingCartStepDef {

    P04_SearchPage searchPage = new P04_SearchPage();
    MainToolbar mainToolbar = new MainToolbar();


    @And("user add samsung laptop to cart")
    public void addSamsungLaptopTOCart()
    {
        searchPage.addToCartByItemID("6").click();
    }
    @Then("system add the item successfully to the cart")
    public void AssertItemAddedSuccessfullyMessageDisplayed()
    {
        Assert.assertEquals(searchPage.addingSuccessfulMessage().getText(),
                "The product has been added to your shopping cart",
                "Error Message: Products is not added to the cart");
    }
    @And("user add oversized women T-shirt to the cart")
    public void addoversizedWomenTshirtTOCart()
    {
        searchPage.addToCartByItemID("28").click();
    }


    @And("system increase cart Qty")
    public void AssertCartQty()
    {
        Assert.assertEquals(mainToolbar.shoppingCartQty().getText(),
                "(2)",
                "Error Message: Not all items are added to the cart");
    }
}
