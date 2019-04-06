Feature: The social media links in footer should be functional
  All social links in footer area should send the user to a valid social media account

  Scenario: When I click to the facebook link than a new window with the facebook page should be open
    Given User start the homepage
    And I scroll down to the footer
    When I select the facebook link in footer
    Then A new window with the facebook page will be opened
