Feature: Gear product test

  @sanity @regression
  Scenario: User should be able to add product successfully to shopping cart
    Given I am on homepage
    When I hover mouse on gear menu
    And I click on bag menu
    And I click on overnight duffle bag
    And I verify the bag text
    And I change the quantity to 3
    And I click on add to cart button
    And I verify bag added to cart text
    And I click pn shopping cart link message
    And I verify the product name
    And I verify the quantity
    And I verify the product price
    And I change the quantity to 5 on shopping cart page
    And I click on update shopping cart button
    Then I verify the total price of the product
