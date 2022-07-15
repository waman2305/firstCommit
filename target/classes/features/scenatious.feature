Feature: Payment methods (Visa/AmazonPay/AmazonPay/ Express/PayPal/ Express/PayPal)


  Scenario: Visa without logging in
  Given user enters the store
  And adds a Canvas product to the cart.
  Then input all the fields
    And input payment fields
  And the user tries to buy this product
  And places an order