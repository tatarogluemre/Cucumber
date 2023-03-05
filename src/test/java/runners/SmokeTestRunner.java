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
                "rerun:target/failed_scenarios.txt" // fail olan test leri tekrar çalıştırmak için bir txt belgesi oluşturur.
        },
        monochrome=true, //raporların konsolda okunaklı çıkması için
        features = "./src/test/resources/features",  //feature folder
        glue = "stepdefinitions", //stepdefinitions , hooks folder
        tags = "@smoke" ,   // tags olmazsa tüm scenario lar çalışır tags varsa sadece o tag in scenario su çalışır.
        dryRun = false   //dryRun=false dryRun yokmuş gibi normal şekilde çalışır.
        // dryRun = true Yeni bir step eklendiğinde sadece stepdefinitions ları oluşturmak için kullanılır.
        //            kullnılma sebebi zamandan tasarruf etmek içindir.

)

public class SmokeTestRunner {
}
