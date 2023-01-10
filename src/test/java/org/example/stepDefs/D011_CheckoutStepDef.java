package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.MainToolbar;
import org.example.pages.P04_SearchPage;
import org.example.pages.P06_CartPage;
import org.example.pages.P07_BillingPage;
import org.testng.Assert;

public class D011_CheckoutStepDef {
    MainToolbar mainToolbar = new MainToolbar();
    P04_SearchPage searchPage = new P04_SearchPage();
    P06_CartPage cartPage = new P06_CartPage();
    P07_BillingPage billingPage = new P07_BillingPage();


    @When("user press on shopping cart button")
    public void clickOnShoppingCart()
    {
        searchPage.shoppingCart().click();
    }
    @Then("the system will open the cart page")
    public void AssertCartPageIsOpened()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),
                "https://demo.nopcommerce.com/cart",
                "Error Message: Cart page is not opened");
    }

    @When("user click on agree terms and checkout button")
    public void clickOnAgreeTermsAndCheckout()
    {
        cartPage.agreeTermsCheckbox().click();
        cartPage.checkoutBTN().click();
    }
    @Then("the system will open the checkout page")
    public void AssertBillingPageIsOpened()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),
                "https://demo.nopcommerce.com/onepagecheckout#opc-billing",
                "Error Message: Billing page is not opened");
    }
    @When("user fill Billing address information")
    public void fillBillingAddressInformation()
    {
        billingPage.countryList().sendKeys("Egypt");
        billingPage.cityTXT().sendKeys("Cairo");
        billingPage.address1TXT().sendKeys("Obour");
        billingPage.zipPostalCodeTXT().sendKeys("01111");
        billingPage.phoneNumberTXT().sendKeys("01228568542");
        billingPage.continueBillingAddressBTN().click();
    }
    @And("user select the ground shipping method")
    public void selectShippingMethod()
    {
        billingPage.continueShippingMethodBTN().click();
    }
    @And("user select check_money order payment method")
    public void selectCheckMoneyPaymentMethod()
    {
        billingPage.continuePaymentMethodBTN().click();
    }
    @And("user select the payment information")
    public void selectPaymentInformation()
    {
        billingPage.continuePaymentInformationBTN().click();
    }
    @And("user click on confirm")
    public void confirmOrder()
    {
        billingPage.confirmOrderBTN().click();
    }


    @Then("the system will display successful order message")
    public void AssertSuccessfulOrderMessage() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(billingPage.successfulOrderMessage().getText(),
                "Your order has been successfully processed!",
                "Error Message: Order submission failed");
    }
}
