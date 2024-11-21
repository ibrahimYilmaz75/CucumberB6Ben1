Feature: Citizenship Functionality

  Background: #Before Senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Citizenships

  Scenario: Create a Citizenship with parameter 1
    When Create a Citizenships name as"ib1123a23" shortName as "454as1ad654"
    Then Success message should be displayed

  Scenario: Create a Citizenship with parameter 2
    When Create a Citizenships name as"ib1123a323" shortName as "454as11ad654"
    Then Success message should be displayed