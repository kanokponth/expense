Feature: login
    As a user
    I can add and view income and expense
    so that I know how much money I have

Scenario: Add income
    Given a user has 500 for income
    When I add income amount 100
    Then I have income amount 600

Scenario: Use money less than balance money
    Given a user has 500 for income
    When I use a money amount 100
    Then I have income amount 500
    And my expense is 100

Scenario: Use money over than balance money
    Given a user has 500 for income
    When I use a money amount 1000
    Then I have income amount 500
    And my expense is 1000

Scenario: Check current income
    Given a user has 1000 for income
    When I want to check my balance income that is 1000
    Then system shows my balance income amount 1000

Scenario: Check current expense
    Given a user has 1000 for income
    When I use a money amount 500
    Then system shows my balance expense amount 500