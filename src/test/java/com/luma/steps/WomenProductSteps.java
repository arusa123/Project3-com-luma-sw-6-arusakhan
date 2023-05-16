package com.luma.steps;

import com.luma.pages.HomePage;
import com.luma.pages.WomenTopPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class WomenProductSteps {
    @When("^I hover mouse on women menu$")
    public void iHoverMouseOnWomenMenu() throws InterruptedException {
        Thread.sleep(1000);
        new HomePage().hoverMouseOnWomenMenu();
    }

    @And("^I hover mouse on women top menu$")
    public void iHoverMouseOnWomenTopMenu() {
        new HomePage().mouseHoverOnWomenTopMenu();
    }

    @And("^I click on Women jacket menu$")
    public void iClickOnWomenJacketMenu() {
        new HomePage().clickOnWomenJacketMenu();
    }

    @And("^I select products by product name$")
    public void iSelectProductsByProductName() {
        new WomenTopPage().productSorter("Product Name ");
    }

    @Then("^I verify the products are sorted by Product name$")
    public void iVerifyTheProductsAreSortedByProductName() {
        Assert.assertEquals("list not soreted",new WomenTopPage().listBeforeSorting(),new WomenTopPage().listAfterSorting());
    }
}
