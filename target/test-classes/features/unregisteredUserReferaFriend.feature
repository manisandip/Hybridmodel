Feature: unregistered friend should not be able to refer a product to friend
  @can'tRefer
  Scenario: unregistered user can't refer product to friend
    Given user is on home page
    When user clicks on computers
    And user select product to refer a friend
    Then user should not be able to refer a product to friend