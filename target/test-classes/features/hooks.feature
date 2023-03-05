@hooks_test
  Feature: Failed Test
    Background: google git
      Given kullanici google gider

    @iphone_search
    Scenario: TC01_iphone_aramasi
      When kullanici "iphone" icin arama yapar
      Then kullanici sonuclarda "iphone" oldugunu dogrular.
      Then ekran goruntusu al
      Then close the applications

    @tesla_search
    Scenario: TC02_tesla_aramasi
      When kullanici "tesla" icin arama yapar
      Then kullanici sonuclarda "toros" oldugunu dogrular.
      Then close the applications

    @elma_search
    Scenario: TC03_elma_aramasi
      When kullanici "elma" icin arama yapar
      Then kullanici sonuclarda "elma" oldugunu dogrular.
      Then close the applications