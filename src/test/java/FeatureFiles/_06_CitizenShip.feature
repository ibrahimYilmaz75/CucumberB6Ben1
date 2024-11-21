#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile yapınız. (Senaryo 1)
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız. (negatif test) (Senaryo 2)
#Ayrı sebaryoda girilen bilgiyi silme işlemini doğrulayınız (Senaryo 3)

Feature: Citizen Functonality
  Background: #Before Senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Citizenships
@RegressionTest @SmokeTest
  Scenario: Create a Citizenships
    When Create a Citizenships name as"ib13aa" shortName as "454as"
    Then Success message should be displayed
  @RegressionTest
  Scenario: Create a Citizenships negative
    When Create a Citizenships name as"ib13aa" shortName as "454as"
    Then Already existy message should be displayed
  @RegressionTest
    Scenario: Delete Citizenship
      When user delete name as "ib13aa"
      Then Success message should be displayed