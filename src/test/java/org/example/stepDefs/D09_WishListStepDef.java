package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.MainToolbar;
import org.example.pages.P04_SearchPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D09_WishListStepDef {

    P04_SearchPage searchPage = new P04_SearchPage();
    MainToolbar mainToolbar = new MainToolbar();


    @And("user add samsung laptop to wishlist")
    public void addSamsungLaptopTOWishlist()
    {
        searchPage.addToWishlistByItemID("6").click();
    }
    @Then("system add the item successfully to the wishlist")
    public void AssertItemAddedSuccessfullyMessageDisplayed()
    {
        Assert.assertEquals(searchPage.addingSuccessfulMessage().getText(),
                "The product has been added to your wishlist",
                "Error Message: Products is not added to the wishlist");
    }
    @And("user add oversized women T-shirt to the wishlist")
    public void addoversizedWomenTshirtTOWishlist()
    {
        searchPage.addToWishlistByItemID("28").click();
    }
    @And("system increase wishlist Qty")
    public void AssertWishlistQty()
    {
        Assert.assertEquals(mainToolbar.wishListQty().getText(),
                "(2)",
                "Error Message: Not all items are added to the wishlist");
    }
}
