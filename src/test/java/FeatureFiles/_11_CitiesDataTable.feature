#Cities menusunun kayıt, Tekrar Aynı Kayıt(Negatif test) ve silme özelliğini test ediniz
Feature: Cities DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
  @SmokeTest
  Scenario: Create Cities

    And  Click on the Element in LeftNav
      | setup      |
      | parameters |
      | Cities     |
    And  Click on the Element in DialogContent
      | addButton |
      | countries |
      | country   |
    And User sending the keys in Dialog
      | nameInput | sa123as231 |
    And Click on the Element in DialogContent
      | saveButton |
    Then Success message should be displayed
    And User delete the element from dialog
      | sa123as231 |
    Then Success message should be displayed