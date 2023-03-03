@data_tables
Feature: data_tables
  Scenario: TC01_musteri_login_test
    Given kullanici "https://www.bluerentalcars.com" ana sayfaya gider
    When kullanici login sayfasina gider
    # | -> dataTable oluşturmak için kullanılır. DataTables Scenario Outline ile de kullanılabilir.
    When kullaci email ve sifresini girer
      |email|sifre|
      |sam.walker@bluerentalcars.com|c!fas_art1|
    And login buttonuna basar
    Then login islemi gerceklestigini dogrular
    And close the applications