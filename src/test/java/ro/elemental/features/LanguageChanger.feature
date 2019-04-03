Feature: Language changer
  The site is in different languages, user can change between them

  Scenario Outline: Language changer
    Given User start the homepage
    When User change the  <preffered> language
    Then The site <preffered> language will be changed to the expected one
    Examples:
      | preffered |
      | romana   |
      | magyar   |
      | english  |

