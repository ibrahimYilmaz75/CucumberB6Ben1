Feature: DataTable Functionality
  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully


    Scenario: Create Country

    And  Click on the Element in LeftNav
      |setup|
      |parameters|
      |countries|

    And  Click on the Element in DialogContent
      |addButton|

    And User sending the keys in Dialog
      |nameInput| iboUlkesi21131|
      |codeInput| iboKod2131231|

    And Click on the Element in DialogContent
      |saveButton|

    Then Success message should be displayed

    And User delete the element from dialog
      |iboUlkesi21131|

    Scenario: Fee Functionality and Delete
      And  Click on the Element in LeftNav
        |setup|
        |parameters|
        |Fees|
      And  Click on the Element in DialogContent
        |addButton|
      And User sending the keys in Dialog
        |nameInput| iboUlkesi21s131|
        |codeInput| iboKod21312a31|
        |integrationCode| asd123456|
        |priority       | 1      |

      And Click on the Element in DialogContent
        |toggleBar|
        |saveButton|
      Then Success message should be displayed
      And User delete the element from dialog
      |iboUlkesi21s131|
      Then Success message should be displayed