Feature: End to end scenario of a user


  Scenario: User login steps to the check out

    Given User start the homepage
    And User accept the gdpr
    And User click to the my account link
    And User submit the correct password and username and click to submit button
    When User search for the wished "<lavantă>"
    And I open the product page, change the size, and add to cart
    When The selected "<lavantă>" is added to the cart
    Then User check out
