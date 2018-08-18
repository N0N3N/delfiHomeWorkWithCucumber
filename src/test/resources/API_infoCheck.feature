Feature: Testing information from API

  Scenario: API parameters test
    When we getting weather from server
    Then lon is -0.13
    And lat is 51.51



