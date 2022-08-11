Feature: feed the cat
  AS AN owner
  I WANT TO feed my cat
  SO THAT it isn't hungry

  Scenario: Successfully feed the cat
    Given the cat is hungry
    And there is food in the bowl
    And the cat likes the food on offer
    When I try to feed the cat
    Then the cat should eat the food
    And the cat should no longer be hungry
    And the amount of food in the bowl should decrease

  Scenario: Cat is not hungry
    Given the cat is not hungry
    When I try to feed the cat
    Then the cat should refuse to eat the food

  Scenario: Cat doesn't like the food
    Given the cat is hungry
    And there is food in the bowl
    And the cat doesn't like the food on offer
    When I try to feed the cat
    Then the cat should refuse to eat the food