@Login
Feature: App login feature test

  Scenario: Login Scenario test
    Given user launches app url
    When user enters '<valid>' username and password
    And user clicks on login button
    And user "<shouldBe>" logged in successful

 Scenario: Login Scenario test with invalid user
    Given user launches app url 
    When user enters '<invalid>' username and password
    And user clicks on login button
    And user "<shouldNotBe>" logged in successful


