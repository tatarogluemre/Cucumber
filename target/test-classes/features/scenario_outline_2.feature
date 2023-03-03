@personel_olustur
Feature: personel_olustur

  Scenario Outline: TC01_Personel_Olustur
     Given kullanici "https://editor.datatables.net" gider
     When kullanici new butonuna tiklar
     And kullanici first name "<firstname>" girer
     And kullanici last name "<lastname>" girer
     And kullanici positions "<positions>" girer
     And kullanici office "<office>" girer
     And kullanici extension "<extension>" girer
     And kullanici start_date "<start_date>" girer
     And kullanici salary "<salary>" girer
     And kullanici create butonuna basar
     When kullanici firstname ile "<firstname>" arama yapar
     Then kullanici gelen sonuclarda name alaninda "<firstname>" icerdigini dogrular
     And close the applications


        Examples: personel_bilgileri
       |firstname|lastname|positions|office|extension|start_date|salary|
       |jhon     |walker  |qa       |Ankara |300        |2023-02-28|120000|
       |jhon     |dalker  |sdet     |Erzurum|5555       |2023-02-27|220000|
       |eser     |malker  |gre      |İstanbul|56754     |2023-02-27|340000|
       |ali      |baba  |sdet      |İstanbul|12123      |2023-02-27|453434|
