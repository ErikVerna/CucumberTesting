Feature: Login Application feature

  Scenario: User Login Scenario
    Given User is on Application Home Page
    When Application Page Title is Facebook
    Then User enter username and password
    And User clicks on Login Button
    When User navigate to user Profile page