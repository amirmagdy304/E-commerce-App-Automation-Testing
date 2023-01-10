package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.MainToolbar;
import org.example.pages.P04_SearchPage;
import org.testng.Assert;

public class D10_CompareListStepDef {

    P04_SearchPage searchPage = new P04_SearchPage();
    MainToolbar mainToolbar = new MainToolbar();


    @And("user add samsung laptop to compare list")
    public void addSamsungLaptopTOWishlist()
    {
        searchPage.addToCompareListByItemID("6").click();
    }
    @Then("system add the item successfully to the compare list")
    public void AssertItemAddedSuccessfullyMessageDisplayed()
    {
        Assert.assertEquals(searchPage.addingSuccessfulMessage().getText(),
                "The product has been added to your product comparison",
                "Error Message: Products is not added to the product comparison");
    }
    @And("user add oversize women T-shirt to the compare list")
    public void cardioversionShirtTOWishlist()
    {
        searchPage.addToCompareListByItemID("28").click();
    }
}
