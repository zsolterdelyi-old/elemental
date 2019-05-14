Feature: The social media links in footer should be functional
  All social links in footer area should send the user to a valid social media account

  Background:
    Given User start the homepage
    And User accept the gdpr
    And I scroll down to the footer


  Scenario: When I click to the facebook link than a new window with the facebook page should be open
    When I select the facebook link in footer
    Then A new window with the facebook page will be opened

  Scenario: When I click to the youtube link than a new window with the youtube page should be open
    When I select the youtube link in footer
    Then A new window with the youtube page will be opened

  Scenario: When I click to the gplus link than a new window with the gplus page should be open
    When I select the gplus link in footer
    Then A new window with the gplus page will be opened

  Scenario: When I click to the instagram link than a new window with the instagram page should be open
    When I select the instagram link in footer
    Then A new window with the instagram page will be opened
