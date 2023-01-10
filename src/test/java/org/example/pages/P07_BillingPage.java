package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P07_BillingPage {

    //    Billing Address
    public WebElement countryList() {
        return Hooks.driver.findElement(By.id("BillingNewAddress_CountryId"));
    }

    public WebElement cityTXT() {
        return Hooks.driver.findElement(By.id("BillingNewAddress_City"));
    }

    public WebElement address1TXT() {
        return Hooks.driver.findElement(By.id("BillingNewAddress_Address1"));
    }

    public WebElement zipPostalCodeTXT() {
        return Hooks.driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
    }

    public WebElement phoneNumberTXT() {
        return Hooks.driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
    }

    public WebElement continueBillingAddressBTN() {
        return Hooks.driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[@name=\"save\"]"));
    }

    //      Shipping Method
    public WebElement continueShippingMethodBTN() {
        return Hooks.driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button"));
    }

    //    Payment Method
    public WebElement continuePaymentMethodBTN() {
        return Hooks.driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button"));
    }

    //    Payment Information
    public WebElement continuePaymentInformationBTN() {
        return Hooks.driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/button"));
    }

    //    Confirm Order
    public WebElement confirmOrderBTN() {
        return Hooks.driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button"));
    }
    public WebElement successfulOrderMessage() {
        return Hooks.driver.findElement(By.xpath("//div[@class=\"center-1\"]//div[@class=\"title\"]"));
    }
}
