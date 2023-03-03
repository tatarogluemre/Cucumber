@bluerentalcar
Feature: homework_smoke_test

  Scenario Outline:TC01_login_test
    Given kullanici "https://www.bluerentalcars.com" ana sayfaya gider
    When kullanici login sayfasina gider
    And kullanıcı adini "<email>" girer
    And sifreyi "<sifre>" girer
    And login buttonuna basar
    Then login islemi gerceklestigini dogrular
    And close the applications

    Examples: data

    |email|sifre|
  |sam.walker@bluerentalcars.com|c!fas_art|
  |kate.brown@bluerentalcars.com|tad1$Fas |
  |raj.khan@bluerentalcars.com|v7Hg_va^   |
  |pam.raymond@bluerentalcars.com|Nga^g6! |
