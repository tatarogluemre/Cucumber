@google_search
Feature: ilk feature file
  @iphone
  Scenario: TC01_google_iphone_arama
  Given kullanici google gider
  When kullanici iphone için arama yapar
  Then kullanici sonuclarda iphone olduğunu dogrular.
  And close the applications
  @tesla
  Scenario: TC02_google_tesla_arama
    Given kullanici google gider
    When kullanici tesla icin arama yapar
    Then sonuclarda tesla oldugunu dogrular
    Then close the applications


  # 1.Her feature file Feature: kelimesi ile başlamak zorundadır.
  # 2.Her bir file da yalnız bir feature file oluşturulabilir.
  # 3.Senaryo(TestCase) oluşturmsk için Scenario kelimesi kullanılır.
  # 4.Birden fazla scenario kullanılabilir.
  # 5.Herbir adım Given,When,And,Then,But,* kelimelerinden biriylr başlamalıdır.
  # 6.Given -> Genelde ilk satırlarda pre conditon stepleri için kullanılır
  # 7.Then -> Genlde son satırlarda verification stepleri için kullanılır.
  # 8.And , When -> Genelde ara adımlarda bağlaç olarak kullanılır
  #  NOTE: Teknik olarak istenilen kelime istenilen stepte kullanılabilir,
  #        ama anlam karmaşası olmaması için bu adımlar takip edilir.
  # 9.Belirli senaryoları çalıştırmak için cucumber tagsler kullanır.
  #   tagler.