Feature: Mens product test

  @sanity @regression
  Scenario: User should add product successFully to shopping cart
    Given I am on homepage
    When I hover mouse on Men menu
    And I hover mouse on men bottom
    And I click on Men pants
    And I hover mouse on the product
    And I click on pants size
    And I click on black colour
    And I click on cronus yoga pants
    And I verify the pants text
    And I click on shopping cart link message from mens page
    And I verify the shopping cart text
    And I verify the pants name
    And I verify the pants size
    Then I verify the pants colour

