Feature: Country Functionalty Outline
  Background: #Before Senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Country

    Scenario Outline: Create a Country with parameter
      When Create a country name as "<name>" code as "<code>"
      Then Success message should be displayed
      When Create a country name as "<name>" code as "<code>"
      Then Already existy message should be displayed
      When user delete name as "<name>"
      Then Success message should be displayed
      Examples:
        | name    | code    |
        | tr1233 | tr5464 |
        | us1322 | us21312 |
        | sa15165 | sa5465 |
        | dsa465 | dsa7548 |
        | qwe32146 | qwe31245 |