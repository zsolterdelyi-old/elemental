Feature:
  Parameter Changer

  Scenario:
  I as a user should have rights to change the parameters of my selected item

    Given User start the homepage
    And I search for the wished "lavantă"
    And I open the product page and I change the size
    Then Size should be changed

