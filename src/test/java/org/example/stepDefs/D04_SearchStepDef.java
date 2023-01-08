package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P00_HomePage;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class D04_SearchStepDef {
    public P00_HomePage homePage = new P00_HomePage();

    @Given("user go to home page")
    public void navigateToPage()
    {
        homePage.navigateToHomePage();
    }

    @When("^user entered \"(.*)\" on the search text$")
    public void searchByItem(String productName)
    {
        homePage.searchTXT().sendKeys(productName);
    }

    @And("user clicked on search")
    public void clickOnSearchBTN()
    {
        homePage.searchBTN().click();
    }

    @Then("system display filtered items")
    public void AssertSearchedItemIsExist()
    {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="),
                "Error Message: Navigation to Search URL is failed");

        softAssert.assertTrue(
                Hooks.driver.findElement(By.xpath(
                        "*//div[@class=\"item-grid\"]//h2[@class=\"product-title\"]")).isDisplayed(),
                "Error Message: Item is not found");
        softAssert.assertAll();
    }
}