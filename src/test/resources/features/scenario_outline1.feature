@scenario_outline_1
  Feature: arama_feature
    Background: google_git
      Given kullanici google gider
@smoke
      Scenario Outline: arama_testi
        When kullanici "<product>" icin arama yapar
        Then kullanici sonuclarda "<product>" oldugunu dogrular.
        Then close the applications
        Examples: data
        |product|
        |iphone|
        |tesla|
        |tv|
        |flower|
        |cat|
        |dog|

  #Scenario -> Scenario Outline
  # "" -> "<sutun_ismi>"
  #    ->  Examples kelimesi kullanılması gerekir.