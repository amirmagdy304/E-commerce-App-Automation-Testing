package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.MainToolbar;
import org.example.pages.P00_HomePage;
import org.example.pages.P01_RegisterPage;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class D01_RegisterStepDef {
    P01_RegisterPage registerPage = new P01_RegisterPage();
    P00_HomePage homePage = new P00_HomePage();
    MainToolbar toolbar = new MainToolbar();
    @Given("user go to register page")
    public void goRegisterPage()
    {
        toolbar.registerICO().click();
    }

    @When("user select gender type")
    public void selectMaleGender()
    {
        registerPage.maleGenderRadio().click();
    }
    @And("^user enter first name \"(.*)\" and last name \"(.*)\"$")
    public void enterFirstAndLastName(String firstName, String lastName)
    {
        registerPage.firstNameTXT().sendKeys(firstName);
        registerPage.lastNameTXT().sendKeys(lastName);
    }
    @And("user enter date of birth")
    public void enterDateOfBirth()
    {
        registerPage.dateOfBirthDayDropDown().sendKeys("2");
        registerPage.dateOfBirthMonthDropDown().sendKeys("March");
        registerPage.dateOfBirthYearDropDown().sendKeys("1987");
    }
    @And("^user enter email \"(.*)\" field$")
    public void enterEmail(String email)
    {
        registerPage.emailTXT().sendKeys(email);
    }

    @And("user entered valid company details")
    public void enterValidCompanyDetails()
    {
        registerPage.companyTXT().sendKeys("EME international");
    }
    @And("^user fills Password fields \"(.*)\" \"(.*)\"$")
    public void enterValidPassword(String password,String confirmedPassword)
    {
        registerPage.passwordTXT().sendKeys(password);
        registerPage.confirmPasswordTXT().sendKeys(confirmedPassword);
    }

    @And("user clicks on register button")
    public void clickRegister()
    {
        registerPage.registerBTN().click();
    }
    @Then("success message is displayed")
    public void AssertSuccessfulRegistration()
    {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Hooks.driver.getCurrentUrl(),
                "https://demo.nopcommerce.com/registerresult/1?returnUrl=/",
                "Error Message: Navigation to registration URL is failed");

        softAssert.assertEquals(Hooks.driver.findElement(By.className("result")).getText(),
                "Your registration completed",
                "Error Message: registration is failed");

        softAssert.assertTrue(registerPage.continueBTN().isDisplayed(),
                "Error Message: Continue button is not displayed");

        softAssert.assertAll();
    }

}