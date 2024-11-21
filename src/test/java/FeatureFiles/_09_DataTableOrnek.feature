Feature: DataTable Ornek
  Scenario: User Write
    When Write username "ibrahim"
    When Write username and password "ibrahim" and "1234"

    And Write username as Datatable
    |ibrahim|
    |ismet|
    |Ummuhan|
    |Neşe|
    |Engin|

    And Write username and password as Datatable
      |ibrahim|12343 |
      |ismet|12346 |
      |Ummuhan|12345 |
      |Neşe|12347 |
      |Engin|12348 |
    #dataProvider (TestNG için), Senaryo Outline (cucumber)
    #görevi verilen her değer için, tüm senayo çalışır
    #DataTable ise , sadece bir step e, çoklu parametre vermek
    #için kullanılır, sadece 1 kez tüm parametreleri stepin içine atar