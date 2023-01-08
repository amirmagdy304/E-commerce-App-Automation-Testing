package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P00_HomePage;
import org.example.pages.P04_SearchPage;
import org.example.pages.P05_ShoesPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D06_HoverCategoriesStepDef {
    public P05_ShoesPage shoesPage = new P05_ShoesPage();
    public P00_HomePage homePage = new P00_HomePage();
    P04_SearchPage searchPage = new P04_SearchPage();
    @When("user hover on Apparel category and open shoes sub category")
    public void selectApparelCategory(){

        Actions action = new Actions(Hooks.driver);
        action.moveToElement(homePage.apparelBTN()).perform();
        homePage.shoesSubCategory().click();
    }

    @Then("system display shoes items")
    public void AssertShoesItemsAreDisplayed()
    {
        Assert.assertEquals(searchPage.itemsPageTitle().getText(),
                "Shoes",
                "Error Message: Shoes items are not displayed");
    }

    @And("user filter by red color")
    public void filterWIthRedColor()
    {
        shoesPage.redColorCheckbox().click();
    }

    @Then("system display red shoes items")
    public void AssertRedShoesItemsAreDisplayed()
    {
        Assert.assertTrue(shoesPage.redColorShoe().isDisplayed(),
                "Error Message: Red shoes items are not displayed");
    }


}
