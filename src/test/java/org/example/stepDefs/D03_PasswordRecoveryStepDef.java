package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.MainToolbar;
import org.example.pages.P00_HomePage;
import org.example.pages.P02_LoginPage;
import org.example.pages.P03_PasswordRecoveryPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class D03_PasswordRecoveryStepDef {
    P02_LoginPage loginPage = new P02_LoginPage();
    MainToolbar toolbar= new MainToolbar();
    P03_PasswordRecoveryPage passwordRecoveryPage = new P03_PasswordRecoveryPage();

    @Given("user go to password recovery page")
    public void forgetPasswordPage()
    {
        toolbar.loginICO().click();
        loginPage.forgetPasswordHref().click();
    }

    @When("^user entered valid recovery email \"(.*)\"$")
    public void enterValidRecoveryEmail(String email)
    {
        passwordRecoveryPage.recoveryEmailTXT().sendKeys(email);
    }
    @And("user clicked on recover button")
    public void enterValidPassword()
    {
        passwordRecoveryPage.recoveryBTN().click();
    }

    @Then("system send Email with instructions")
    public void AssertNavigateToPasswordRecoveryPageURL()
    {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Hooks.driver.getCurrentUrl(),
                "https://demo.nopcommerce.com/passwordrecovery",
                "Error Message: Navigation to Password recovery URL is failed");

        softAssert.assertEquals(Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]")).getText(),
                "Email with instructions has been sent to you.",
                "Error Message: Password Recovery is failed");

        softAssert.assertAll();
    }
}
