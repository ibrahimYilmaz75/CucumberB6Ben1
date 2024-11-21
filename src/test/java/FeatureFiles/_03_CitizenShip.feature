#Senaryo
#Citizenships sayfasına gidiniz.
#1 adet Citizenships kaydı yapılabildiğini doğrulayınız.

Feature: CitizenShip Functinality

  Scenario: Create a citizenShip

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Citizenships
    When Create a CitizenShip
    Then Success message should be displayed