package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.example.pages.P04_SearchPage;
import org.testng.Assert;

public class D07_TagsStepDef {

    P04_SearchPage searchPage = new P04_SearchPage();
    @And("user click on apparel tag")
    public void pressOnApparelTag()
    {
        searchPage.apparelTag().click();
    }
    @Then("system display Products tagged with \"apparel\" tag")
    public void AssertApparelTagIsDisplayed()
    {
        Assert.assertEquals(searchPage.itemsPageTitle().getText(),
                "Products tagged with 'apparel'",
                "Error Message: Products tagged with 'apparel' is not displayed");
    }
}
