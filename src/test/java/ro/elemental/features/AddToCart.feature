Feature: I add a product to cart
  User search for a product, after that he should be able to add the selected item to the cart

  Scenario: I add the searched item to the cart
    Given User start the homepage
    And User submit the correct password and username and click to submit button
    When I search for the wished "item"
    And I add the "item" to the cart
    Then The selected "item" should be added to the cart