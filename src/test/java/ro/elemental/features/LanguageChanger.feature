Feature: Language changer
  The site is in different languages, user can change between them

  Scenario: Language changer
    Given User start the homepage
    When User change the <language>
    Then The site <language> will be changed to the preferred one
    Examples:
      | language |
      | romana   |
      | magyar   |
      | english  |

