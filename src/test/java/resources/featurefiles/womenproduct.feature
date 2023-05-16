Feature: Women product test

  @sanity @regression
  Scenario: Verify the products are sorted by Name filter
    Given I am on homepage
    When I hover mouse on women menu
    And I hover mouse on women top menu
    And I click on Women jacket menu
    And I select products by product name
    Then I verify the products are sorted by Product name