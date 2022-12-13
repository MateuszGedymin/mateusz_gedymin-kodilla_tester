Feature: Display balance

  Scenario Outline: User checks the balance of their wallet
    Given There is <saldo> in my wallet
    When I check the balance of my wallet
    Then I should see that the balance is <saldo>
    Examples:
      | saldo |
      | 100   |
      | 200   |
      | 1   |
      | 39   |
      | 99   |
      | 10000   |
      | 10   |
      | -200   |
      | -1   |
      | 0   |


