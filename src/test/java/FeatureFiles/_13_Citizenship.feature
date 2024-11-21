#CitizenShip menusunun kayıt ve silme özelliğini
#(DataTable ile) 5 farklı değer seti ile çalıştırınız.
Feature: Citizenship DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Create Nationality and Delete
    And Click on the Element in LeftNav
      | setup       |
      | parameters  |
      | citizenship |
    And Click on the Element in DialogContent
      | addButton |
    And User sending the keys in Dialog
      | nameInput | <name>      |
      | shortName | <shortName> |
    And Click on the Element in DialogContent
      | saveButton |
    Then Success message should be displayed
    And User delete the element from dialog
      | <name> |
    Then Success message should be displayed

    Examples:
      | name    | shortName |
      | ibn1k11 | sa12      |
      | ibn1k12 | sa13      |
      | ibn1k13 | sa14      |
      | ibn1k14 | sa15      |
      | ibn1k15 | sa16      |