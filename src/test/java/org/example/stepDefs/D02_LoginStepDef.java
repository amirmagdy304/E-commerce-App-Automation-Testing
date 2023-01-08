package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.MainToolbar;
import org.example.pages.P00_HomePage;
import org.example.pages.P02_LoginPage;
import org.testng.asserts.SoftAssert;

public class D02_LoginStepDef {

    P02_LoginPage loginPage = new P02_LoginPage();
    P00_HomePage homePage = new P00_HomePage();
    MainToolbar toolbar = new MainToolbar();
    @Given("user go to login page")
    public void goRegisterPage()
    {
        toolbar.loginICO().click();
    }

    @When("^user login with \"(.*)\" and \"(.*)\"$")
    public void enterValidEmailAndPassword(String userName, String password)
    {
        loginPage.emailTXT().sendKeys(userName);
        loginPage.passwordTXT().sendKeys(password);
    }

    @And("user press on login button")
    public void clickOnLoginBTN()
    {
        loginPage.loginBTN().click();
    }

    @Then("user login to the system successfully")
    public void AssertLoginSuccessfully()
    {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(
                Hooks.driver.getCurrentUrl(),
                homePage.homePageURL,
                "Error Message: Navigation to HomePage URL is failed");
        softAssert.assertTrue(
                toolbar.myAccountICO().isDisplayed(),
                "Error Message: My account Icon is not displayed");
        softAssert.assertAll();
    }

    @Then("user could not login to the system")
    public void AssertCouldNotLoginSuccessfully()
    {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(
                Hooks.driver.getCurrentUrl(),
                "https://demo.nopcommerce.com/login?returnurl=%2F",
                "Error Message: Navigation to HomePage URL is failed");

        softAssert.assertEquals(
                loginPage.unsuccessfulMsg().getText(),
                "Login was unsuccessful. Please correct the errors and try again.\n" +
                        "No customer account found",
                "Error Message: The unsuccessful message is not displayed");

        softAssert.assertAll();
    }

}
