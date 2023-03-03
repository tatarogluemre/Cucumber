@hooks_test
  Feature: Failed Test
    Background: google git
      Given kullanici google gider

    @iphone_search
    Scenario: TC01_iphone_aramasi
      When kullanici "iphone" icin arama yapar
      Then kullanici sonuclarda "elma" oldugunu dogrular.
      Then close the applications

    @tesla_search
    Scenario: TC02_tesla_aramasi
      When kullanici "tesla" icin arama yapar
      Then kullanici sonuclarda "toros" oldugunu dogrular.
      Then close the applications