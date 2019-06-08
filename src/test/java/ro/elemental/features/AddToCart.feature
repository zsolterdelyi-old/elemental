Feature: I add a product to cart
  User search for a product, after that he should be able to add the selected item to the cart

  Scenario: I add the searched item to the cart
    Given User start the homepage
    And I search for the wished "Hamamelis"
    And I open the product page and I add the item to the cart
    Then The selected "Hamamelis" should be added to the cart



