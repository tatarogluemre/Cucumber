@parametreli_google_search
Feature: parametreli feature

  Background: google git
    Given kullanici google gider

  @iphone_search
  Scenario: TC01_iphone_aramasi
    When kullanici "iphone" icin arama yapar
    Then kullanici sonuclarda "iphone" oldugunu dogrular.
    Then close the applications

  @tesla_search
  Scenario: TC02_tesla_aramasi
  When kullanici "tesla" icin arama yapar
  Then kullanici sonuclarda "tesla" oldugunu dogrular.
  Then close the applications

  @mercedes_search
  Scenario: TC03_mercedes_aramasi
    When kullanici "mercedes" icin arama yapar
    Then kullanici sonuclarda "mercedes" oldugunu dogrular.
    Then close the applications

  @samsung_search
  Scenario: TC04_samsung_aramasi
    When kullanici "samsung" icin arama yapar
    Then kullanici sonuclarda "samsung" oldugunu dogrular.
    Then close the applications