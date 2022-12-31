@prod
Feature: Login to production
  
  In order to perform successful login to Production
  As a user
  I want to enter correct username and password 
  I am the best Expert on the Planet

  Background: 
    Given user navigates to facebook website
    When user validates the homepage title

  Scenario Outline: In order to verify login to facebook prod
    Then user entered "<username>"
    Then user entered "<password>"
    And user validates the captcha image
   
    Then user	"loginType" successfully logged in

    Examples: 
      | username | password | loginType |
      | valid    | valid    | should    |
      | invalid  | invalid  | shouldNot |
      | valid    | valid    | should    |
      | invalid  | invalid  | shouldNot |
      | valid    | valid    | should    |
      | invalid  | invalid  | shouldNot |
      | valid    | valid    | should    |
      | invalid  | invalid  | shouldNot |
      | invalid  | invalid  | shouldNot |
      | valid    | valid    | should    |
      | invalid  | invalid  | shouldNot |
      | valid    | valid    | should    |
      | invalid  | invalid  | shouldNot |
      | valid    | valid    | should    |
      | invalid  | invalid  | shouldNot |
