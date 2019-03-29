Feature: Language changer
  The site is in different languages, user can change between them

  Scenario Outline: Language changer
    Given User start the homepage
    When User choose <language> to <preferred> language
    Then The site <language> will be changed to the <preferred> one
    Examples:
      | language | preferred |
      | romana   | ro        |
      | magyar   | hu        |
      | english  | eng       |

