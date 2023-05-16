package com.luma.pages;

import com.luma.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());
    //declaring the elements variable
    @CacheLookup
    @FindBy(xpath = "(//div[@class='product-item-details'])[2]/strong/a")
    WebElement verifyTheProductName;

    @CacheLookup
    @FindBy(xpath = "//input[@class='input-text qty']")
    WebElement quantityField;

    @CacheLookup
    @FindBy(xpath = "//span[@data-bind='text: getValue()'][normalize-space()='$135.00']")
    WebElement verifyTheProductPrice;
    @CacheLookup
    @FindBy(xpath = "//button[@class='action update']")
    WebElement clickOnupdateShoppingCart;

    @CacheLookup
    @FindBy(xpath = "(//span[@class='cart-price'])[2]")
    WebElement verifytheUpdatedPrice;

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement theSizeOfThePants;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement theColourOfThePants;

    //this method will verify the product name
    public String verifyTheProdutsName() {
        Reporter.log("Get the product name " + verifyTheProductName.toString());
        return verifyTheProductName.getText();
    }

    //this method will verify the quanity of the bag
    public String getQuantityOfProduct() {
        String quantity = quantityField.getAttribute("value");
        Reporter.log("Get quantity " + quantity.toString());
        return quantity;
    }

    //this method will verify the product price
    public String getPriceOfTheProduct() {
        Reporter.log("Get Price " + verifyTheProductPrice.toString());
        return verifyTheProductPrice.getText();
    }

    //this method will change the quantity
    public void changeTheQuanitytOfTheBag(String qty) {
        quantityField.sendKeys(Keys.DELETE);
        Reporter.log("Change quantity " + quantityField.toString());
        sendTextToElement(quantityField, qty);
    }

    //this method will update the shopping cart
    public void updateTheShoppingCart() {

        clickOnElement(clickOnupdateShoppingCart);
        Reporter.log("click on shopping cart " + clickOnupdateShoppingCart.toString());
    }

    //this method will verify the updated price
    public String UpdatedProductPrice() throws InterruptedException {
        Thread.sleep(500);
        // waitUntilVisibilityOfElementLocated(verifytheUpdatedPrice, 20);
        //  Reporter.log("Updated price " + verifytheUpdatedPrice.toString());
        //CustomListeners.test.log(Status.PASS, "Updated Price " + verifytheUpdatedPrice);
        return verifytheUpdatedPrice.getText();
    }

    public String getTheShoppingCartPageTitle() {
        Reporter.log("Get quantity " + shoppingCartText.toString());
        return shoppingCartText.getText();
    }

    public String getTheSizeOfThePants() {
        Reporter.log("Get the size of the pant " + shoppingCartText.toString());
        return theSizeOfThePants.getText();
    }

    public String getTheColourOfThePants() {
        Reporter.log("Get the colour of the pants " + theColourOfThePants.toString());
        return theColourOfThePants.getText();
    }


}
