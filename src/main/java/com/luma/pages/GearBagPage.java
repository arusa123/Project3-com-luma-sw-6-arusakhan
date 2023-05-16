package com.luma.pages;

import com.luma.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class GearBagPage extends Utility {
    private static final Logger log = LogManager.getLogger(GearBagPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement overnightDuffle;
    @CacheLookup
    @FindBy(xpath = "//span[contains(.,'Overnight Duffle')]")
    WebElement bagTitle;
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement quantityField;
    @CacheLookup
    @FindBy(id = "product-addtocart-button")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//div[contains(@data-bind,'html: $parent.prepareMessageForHtml(message.text)')]")
    WebElement addedSuccfullyText;
    @CacheLookup
    @FindBy(linkText = "shopping cart")
    WebElement clickOnShoppingLink;

    //this method will click on the bag
    public void clickOnNightDuffleBag() {
        clickOnElement(overnightDuffle);

    }

    //this method will verify the text
    public String verifyTheBagText() {
        return getTextFromElement(bagTitle);

    }

    //this method will change the quantity
    public void changeTheQuanityOfTheBag(String qty) {
      quantityField.sendKeys(Keys.DELETE);
        sendTextToElement(quantityField, qty);
         Reporter.log("Get heading text " + qty.toString());
    }

    //this method will click on cart
    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
        Reporter.log("Add to cart " + addToCartButton.toString());
    }

    //this method will get the added to cart successfully  text
    public String bagAddedToCartSuccessfullyMessage() {
        Reporter.log("Added to cart " + addedSuccfullyText.toString());
        return getTextFromElement(addedSuccfullyText);

    }

    //this method will click on shopping link
    public void clickOnShoppingCartLink() {
        clickOnElement(clickOnShoppingLink);
        Reporter.log("Shopping cart button " + clickOnShoppingLink.toString());
    }


}
