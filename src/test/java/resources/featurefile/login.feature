Feature: Login Test
  As a User I want to Login to SauceDemo Website

  @smoke
  Scenario: User should Login successfully with Valid Credentials
    Given I am on Login Page
    When I enter User name  "standard_user"
    And   I enter Password "secret_sauce"
    And I click on Login Button
    Then I should login successfully
    And I should see the products "Products" text

    @sanity @regression
    Scenario: User should verify 6 products are displayed after login
      Given I am on Login Page
      When I enter User name  "standard_user"
      And   I enter Password "secret_sauce"
      And I click on Login Button
      Then I should login successfully
      And I should see number of products on the page as 6