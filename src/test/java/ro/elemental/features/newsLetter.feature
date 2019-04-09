Feature: Newsletter sign up
  If I sign up for the newsletter, my email address should be added to the database

  Scenario: Newsletter sign up
    Given User start the homepage
    And I scroll down to the footer
    When I submit my email adress to the newsletter field and click the submit button
    Then I will succesfully submit my aplication to newsletter