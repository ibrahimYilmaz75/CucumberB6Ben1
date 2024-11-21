Feature: Citizenship Functionality

  Background: #Before Senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Citizenships

  Scenario Outline: Create a Citizenship with parameter

    When Create a Citizenships name as"<name>" shortName as "<shortName>"
    Then Success message should be displayed
    When Create a Citizenships name as"<name>" shortName as "<shortName>"
    Then Already existy message should be displayed
    When user delete name as "<name>"
    Then Success message should be displayed

    Examples:
      | name    | shortName    |
      | is1212CS1 | is71mCAs |
      | is3m32CS2 | is71mCSassa |
      | is71m425CS3 | is71mCS3er |
      | is71m6452CS4 | is71mCS4ht|
      | 341gfa | is71mCS5sbs |

     #  dataProvider (TestNG için), Senaryo Outline (cucumber)
     #  görevi verilen her değer için, tüm senayo çalışır

  # TODO : Sates menusu create,update,delete olarak, Senaryo outline şeklinde 5 kez çalıştırınız