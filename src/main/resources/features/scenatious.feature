Feature: Payment methods (Visa/AmazonPay/AmazonPay/ Express/PayPal/ Express/PayPal)


  Scenario: Visa without logging in
  Given user enters the store
  And adds a Canvas product to the cart.
  Then the user tries to buy this product
  And places an order