Feature: Language changer
  The site is in different languages, user can change between them

  Scenario: Language changer
    Given User start the homepage
    When User change to the  "english" language
    Then The site "english" language will be changed to the expected one
    And  User change to the  "<romanian>" language
    Then The site "<romanian>" language will be changed to the expected one
    And User change to the  "<hungarian>" language
    Then The site "<hungarian>" language will be changed to the expected one
