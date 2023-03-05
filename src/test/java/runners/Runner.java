package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failed_scenarios.txt", // fail olan test leri tekrar çalıştırmak için bir txt belgesi oluşturur. FailedRunner ile bu belge çalıştırılır.
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"//spark report için eklenen plugin

        },
        monochrome=true, //raporların konsolda okunaklı çıkması için
        features = "./src/test/resources/features",  //feature folder
        glue = {"stepdefinitions","hooks"}, //stepdefinitions , hooks(fail olan testlerin ekran görüntüsünü alır) folder
        tags = "@excel_automation" ,   // tags olmazsa tüm scenario lar çalışır tags varsa sadece o tag in scenario su çalışır.
        dryRun = false   //dryRun=false dryRun yokmuş gibi normal şekilde çalışır.
                        // dryRun = true Yeni bir step eklendiğinde sadece stepdefinitions ları oluşturmak için kullanılır.
                       //            kullnılma sebebi zamandan tasarruf etmek içindir.

)
public class Runner {
    //Bu sınıf TestCase leri Run etmek için kullanılır.
    //Ve configurations lar için kullanılır.
}
