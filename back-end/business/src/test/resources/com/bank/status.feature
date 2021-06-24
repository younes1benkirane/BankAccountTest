Feature: Client and Bank

  Scenario: multiplying a number by 0 should result to 0
    Given the number '141'
    When the number is multiplied by '0'
    Then the result should be '0'