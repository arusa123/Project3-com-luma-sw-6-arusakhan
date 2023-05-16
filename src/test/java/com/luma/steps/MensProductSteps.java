package com.luma.steps;

import com.luma.pages.HomePage;
import com.luma.pages.MensPantsPage;
import com.luma.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MensProductSteps {
    @When("^I hover mouse on Men menu$")
    public void iHoverMouseOnMenMenu() {
        new HomePage().hoverMouseOnMenMenu();

    }

    @And("^I hover mouse on men bottom$")
    public void iHoverMouseOnMenBottom() {
        new HomePage().hoverMouseOnMenBottom();
    }

    @And("^I click on Men pants$")
    public void iClickOnMenPants() {
        new HomePage().clickOnMenPantsMenu();
    }

    @And("^I hover mouse on the product$")
    public void iHoverMouseOnTheProduct() {
        new MensPantsPage().hoverMouseOnTheProduct();
    }

    @And("^I click on pants size$")
    public void iClickOnPantsSize() {
        new MensPantsPage().clickOnTheRequiredSize();
    }

    @And("^I click on black colour$")
    public void iClickOnBlackColour() {
        new MensPantsPage().clickOnTheRequiredColour();
    }

    @And("^I click on cronus yoga pants$")
    public void iClickOnCronusYogaPants() {
        new MensPantsPage().clickOnTheAddCartButton();
    }

    @And("^I verify the pants text$")
    public void iVerifyThePantsText() {
        String shoppingText = "You added Cronus Yoga Pant to your shopping cart.";
        Assert.assertEquals("pants not added", shoppingText, new MensPantsPage().getTheShoppingcartText());
    }

    @And("^I click on shopping cart link message from mens page$")
    public void iClickOnShoppingCartLinkMessageFromMensPage() {
        new MensPantsPage().clickOnShoppingCartLink();
    }

    @And("^I verify the shopping cart text$")
    public void iVerifyTheShoppingCartText() {
        Assert.assertEquals("wrong text", "Shopping Cart", new ShoppingCartPage().getTheShoppingCartPageTitle());
    }

    @And("^I verify the pants name$")
    public void iVerifyThePantsName() {
        Assert.assertEquals("wrong pants", "Cronus Yoga Pant", new MensPantsPage().getThePantsText());
    }

    @And("^I verify the pants size$")
    public void iVerifyThePantsSize() {
        Assert.assertEquals("wrong size", "32", new ShoppingCartPage().getTheSizeOfThePants());
    }

    @Then("^I verify the pants colour$")
    public void iVerifyThePantsColour() {
        Assert.assertEquals("wrong colour", "Black", new ShoppingCartPage().getTheColourOfThePants());
    }
}
