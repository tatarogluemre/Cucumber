package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@iphone or @tesla"    //tags olmazsa tüm scenario lar çalışır tags varsa sadece o tag in scenario su çalışır.
)
public class Runner {
    //Bu sınıf TestCase leri Run etmek için kullanılır.
    //Ve configurations lar için kullanılır.
}
