Feature: Calculadora
  @CLEAN

  Scenario: suma

    Given I have access to Calculator App
    When I click the nine button on main screen
    And I click the add button on main screen
    And I click the two button on main screen
    And I click the equal button on main screen
    Then the result should be "11"