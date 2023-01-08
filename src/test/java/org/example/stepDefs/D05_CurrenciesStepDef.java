package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.MainToolbar;
import org.example.pages.P00_HomePage;
import org.junit.Assert;

public class D05_CurrenciesStepDef {
    public P00_HomePage homePage = new P00_HomePage();
    MainToolbar toolbar = new MainToolbar();

    @When("user change the currency to Euro")
    public void changeCurrency() throws InterruptedException {
        toolbar.currencyList().click();
        homePage.EuroCurrency().click();
    }

    @Then("system change price to Euro")
    public void assertEuroCurrencyIsSelected()
    {
        Assert.assertTrue("Error message: The Euro currency is not selected Successfully",
                homePage.EuroCurrency().isSelected());
    }
}
