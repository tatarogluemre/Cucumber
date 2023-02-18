package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",
        glue = "stepdefinations"
)
public class Runner {
    //Bu sınıf TestCase leri Run etmek için kullanılır.
    //Ve configurations lar için kullanılır.
}
