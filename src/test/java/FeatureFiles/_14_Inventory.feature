Feature: Citizenship DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Create Nationality and Delete
    And Click on the Element in LeftNav
      | inventory       |
      | inventorySetup |
      | itemCategories |
    And Click on the Element in DialogContent
      | addButton |
    And User sending the keys in Dialog
      | nameInput | <name> |
    And Click on the Element in DialogContent
      | User Type        |
      | User Type Option |
      | toggleBar        |
      | saveButton       |
    Then Success message should be displayed
    And User delete the element from dialog
      | <name> |
    Then Success message should be displayed
    Examples:
      | name          |
      | ibrahimItem11 |
      | ibrahimItem12 |
      | ibrahimItem13 |
      | ibrahimItem14 |
      | ibrahimItem15 |