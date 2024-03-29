@sauceLabs
Feature: sauce labs

  Background:
    Given the user enter to application 'sauceLabs'

  Scenario: Login with valid credentials
    And the user click to burger button

  @shopping
  Scenario Outline: Navigating on the page
    When Click on the <Product> you want, for the text.
    And Choose the <Color> if you can, otherwise leave the default color if there is one.
    And Add a certain <NumberTimes> of products.
    Then Check that the <CorrectNumber> of products is correct.

    Examples:
      | Product                  | Color | NumberTimes | CorrectNumber |
      | Sauce Labs Backpack      | red   | 2           | 2             |
      | Sauce Labs Bike Light    | black | 1           | 1             |
      | Sauce Labs Bolt T-Shirt  | black | 1           | 1             |
      | Sauce Labs Fleece Jacket | gray  | 2           | 2             |

  @sucessfulShopping
  Scenario Outline: Checkout to the shop
    When the user clicks on the product <item>
    And the user adds the item to the cart <times> times
    Then the item counter should match <times>
    And I click add items to cart
    And I click on the shopping cart
    And I click on the checkout button
    And I enter my credentials
      | field    | user1           |
      | Username | bob@example.com |
      | Password | 10203040        |