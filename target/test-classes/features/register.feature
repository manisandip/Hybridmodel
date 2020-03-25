Feature: user should be able to register successfully ,
  so that he can use all user features from our website
  @register
  Scenario: user should be able to register
    Given user is on register page
    When user enters all register page
    And user clicks on register button
    Then user should be able to register successfully

