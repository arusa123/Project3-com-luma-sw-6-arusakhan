package com.luma.steps;

import com.luma.pages.GearBagPage;
import com.luma.pages.HomePage;
import com.luma.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class GearProductSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I hover mouse on gear menu$")
    public void iHoverMouseOnGearMenu() {
        new HomePage().hoverMouseOnGearMenu();

    }

    @And("^I click on bag menu$")
    public void iClickOnBagMenu() {
        new HomePage().clickOnBagMenu();
    }

    @And("^I click on overnight duffle bag$")
    public void iClickOnOvernightDuffleBag() {
        new GearBagPage().clickOnNightDuffleBag();
    }

    @And("^I verify the bag text$")
    public void iVerifyTheBagText() {
        Assert.assertEquals("incorrect bag", "Overnight Duffle", new GearBagPage().verifyTheBagText());
    }

    @And("^I change the quantity to (\\d+)$")
    public void iChangeTheQuantityTo(int qty) {
        new GearBagPage().changeTheQuanityOfTheBag("3");
    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new GearBagPage().clickOnAddToCartButton();
    }

    @And("^I verify bag added to cart text$")
    public void iVerifyBagAddedToCartText() {
        String bagAdded = "You added Overnight Duffle to your shopping cart.";
        Assert.assertEquals("bag not added", bagAdded, new GearBagPage().bagAddedToCartSuccessfullyMessage());
    }

    @And("^I click pn shopping cart link message$")
    public void iClickPnShoppingCartLinkMessage() {
        new GearBagPage().clickOnShoppingCartLink();
    }

    @And("^I verify the product name$")
    public void iVerifyTheProductName() {
        Assert.assertEquals("wrong bag name", "Overnight Duffle", new ShoppingCartPage().verifyTheProdutsName());
    }

    @And("^I verify the quantity$")
    public void iVerifyTheQuantity() {
        Assert.assertEquals("wrong quantity", "3", new ShoppingCartPage().getQuantityOfProduct());
    }

    @And("^I verify the product price$")
    public void iVerifyTheProductPrice() {
        Assert.assertEquals("wrong price", "$135.00", new ShoppingCartPage().getPriceOfTheProduct());
    }

    @And("^I change the quantity to (\\d+) on shopping cart page$")
    public void iChangeTheQuantityToOnShoppingCartPage(String qty) {
        new ShoppingCartPage().changeTheQuanitytOfTheBag("5");
    }

    @And("^I click on update shopping cart button$")
    public void iClickOnUpdateShoppingCartButton() {
        new ShoppingCartPage().updateTheShoppingCart();
    }

    @Then("^I verify the total price of the product$")
    public void iVerifyTheTotalPriceOfTheProduct() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("wrong price", "$225.00", new ShoppingCartPage().UpdatedProductPrice());
    }


}
