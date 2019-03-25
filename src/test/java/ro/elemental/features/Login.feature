Feature: User login
  User with the correct password and username should be able to log into the personal account

  Scenario: User login

    Given User start the homepage
    And User click to the "My account" link
    When User submit the correct password and username
    And User click to the "Sign in" button
    Then User will be logged in my account area
