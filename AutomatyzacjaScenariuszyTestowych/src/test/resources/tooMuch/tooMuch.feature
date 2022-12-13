Feature: Prevent users from taking out more money than their wallet contains

  Scenario Outline: User tries to take out more money than their balance
    Given there is <deposit> in my wallet
    When I withdraw <withdraw>
    Then nothing should be dispensed
    And I should be told that I don't have enough money in my wallet
    Examples:
      | deposit | withdraw |
      | 100 | 200 |
      | 0 | 15000 |
      | 10000 | 0 |