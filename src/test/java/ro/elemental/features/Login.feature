Feature: User login
  User with the correct password and username should be able to log into the personal account

  Scenario: User login

    Given User start the homepage
    And User click to the my account link
    When User submit the correct password and username and click to subbmit button
    Then User will be logged in my account area
