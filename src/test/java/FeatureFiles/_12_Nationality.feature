Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Create Nationality and Delete
    And Click on the Element in LeftNav
      | setup         |
      | parameters    |
      | Nationalities |
    And Click on the Element in DialogContent
      | addButton |
    And User sending the keys in Dialog
      | nameInput | <name> |
    And Click on the Element in DialogContent
      | saveButton |
    Then Success message should be displayed
    And User delete the element from dialog
      | <name> |
    Then Success message should be displayed

    Examples:
      | name    |
      | ibn1k11 |
      | ibn1k12 |
      | ibn1k13 |
      | ibn1k14 |