Feature: Amazon Search

  Scenario: Search a Product
    Given I have a search field on Amazon page
    When I search for a product named "Apple Macbook Pro" and price 1000
    Then Product with name "Apple Macbook Pro" should be displayed

