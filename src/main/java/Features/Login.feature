Feature: Login Application feature

  Scenario: User Login Scenario
    Given User is on Application Home Page
    When Application Page Title is Facebook
    Then User enter username and password
    And User clicks on Login Button
    When User navigate to user Profile page

#  Scenario: Verify Duplicate Registration
#    Given user on Application Page
#    When User Clicks on Sign-up Button
#    Then User fills the sign up form
#    And User Clicks the Submit Button
#    Then Display already Registered Message
#    Then Navigate to reset password page