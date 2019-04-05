Feature: Language changer
  The site is in different languages, user can change between them

  Scenario: Language changer
    Given User start the homepage
    When User change to the  "preffered" language
    Then The site "preffered" language will be changed to the expected one
