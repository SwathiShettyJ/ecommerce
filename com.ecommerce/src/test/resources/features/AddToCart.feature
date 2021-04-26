@shoppingCart
Feature: Shopping cart Testcases
  As a user I should be able to add/delete items to Cart

  @TC_01
  Scenario: Verify if user is able to add item to Cart successfully
    Given User is in 'Shopizer' Page
    And select category 'Tables'
    And add an item to cart
    Then verify quantity 1 in checkout page
  
   @TC_02
  Scenario: 1.Adding a duplicate item to the cart should increment the quantity and 2. Change quantity in cart and verify
    Given User is in 'Shopizer' Page
    And select category 'Tables'
    And click the item twice to add 2 quantity
    Then verify quantity 2 in checkout page
    And Change the quantity to 1 and verify total is 999
    
    
     @TC_03
  Scenario: Negative Testcase : Invalid quantity
    Given User is in 'Shopizer' Page
    And select category 'Tables'
    And add an item to cart
    Then verify quantity 2 in checkout page