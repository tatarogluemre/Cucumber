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
                "junit:target/xml-report/cucumber.xml"
        },
        monochrome=true,
        features = "./src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@personel_olustur" ,   //tags olmazsa tüm scenario lar çalışır tags varsa sadece o tag in scenario su çalışır.
        dryRun = false  //dryRun=false dryRun yokmuş gibi normal şekilde çalışır.
                       // dryRun = true Yeni bir step eklendiğinde sadece stepdefinitions ları oluşturmak için kullanılır.
                     //            kullnılma sebebi zamandan tasarruf etmek içindir.

)
public class Runner {
    //Bu sınıf TestCase leri Run etmek için kullanılır.
    //Ve configurations lar için kullanılır.
}
