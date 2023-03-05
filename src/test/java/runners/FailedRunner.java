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
        features = "@target/failed_scenarios.txt",  //fail olan scenario ların oluştuğu target dosyasındaki failed_scenario.txt çalıştırı
        glue = {"stepdefinitions","hooks"} //stepdefinitions , hooks folder


)
public class FailedRunner {
}
