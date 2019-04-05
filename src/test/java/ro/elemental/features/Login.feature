Feature: User login
  User with the correct password and username should be able to log into the personal account

  Background:
    Given User start the homepage
    And User click to the my account link

  Scenario: User login


    When User submit the correct password and username and click to submit button
    Then User will be logged in my account area

    Scenario: User login with wrong password
      When User submit the incorrect password and username and click to submit button
      Then User get an error message