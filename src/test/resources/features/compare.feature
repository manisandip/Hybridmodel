Feature: User should be able to compare two products successfully
  @compare
  Scenario: user compares two different products
    Given user is on home page
    When user clicks on jewelery
    And user compares two products
    Then user should be able to compare two products successfully