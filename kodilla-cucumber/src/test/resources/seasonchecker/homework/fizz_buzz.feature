Feature: Simple game, return String depend on number

      Scenario Outline: We can get Fizz, Buzz, Both or None
        Given I get a <number>
        When I check if its dividable by 3 or 5
        Then I return <answer>
        Examples:
          | number | answer |
          | 1 | "None" |
          | 2 | "None" |
          | 3 | "Fizz" |
          | 4 | "None" |
          | 5 | "Buzz" |
          | 6 | "Fizz" |
          | 7 | "None" |
          | 15 | "FizzBuzz" |