Feature: verify user can see price high to low in the products successfully
  @highToLow
  Scenario: user can see price high to low
    Given user is on home page
    When user clicks on computers
    And user clicks on price high to low
    Then user should be able to see price high to low successfully