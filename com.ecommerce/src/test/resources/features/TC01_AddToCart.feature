@shoppingCart
Feature: Shopping cart Testcases
  As a user I should be able to add/delete items to Cart

  @TC_01
  Scenario: A user should be able to add item to Cart
    Given User is in 'Shopizer' Page
    And select category 'Tables'
    And add an item to cart
    Then verify quantity 1 in checkout page
  
   @TC_02
  Scenario: Add a duplicate item to the cart should instead increment the quantity and change quantity in cart
    Given User is in 'Shopizer' Page
    And select category 'Tables'
    And click the item twice to add 2 quantity
    Then verify quantity 2 in checkout page
    And Change the quantity to 1 and verify total is 999