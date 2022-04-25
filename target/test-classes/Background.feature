 @Login
Feature: To validate Login Functionality of facebook Application

  @smoke @sanity
  Scenario: To validate Login using invalid username and invalid password
    When User have to enter invalid username and invalid password
    And User Click the Login button
    Then User should be in invalid credential Page

  @smoke @regression
  Scenario: To validate login using valid username and invalid password
    When User have to enter valid username and invalid password
    And User Clicks the Login Button
    Then User should be in a invalid Credential Page
