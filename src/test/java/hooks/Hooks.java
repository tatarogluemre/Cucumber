package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
    Herbir Scenario yada Scenario Outline dan önce çalışmasını istediğimiz metotlar
    @Before ve @After metotlarını içerir
    Burda önemli olan raporlama işleminin ekran görüntüleri eklenmesi Hooks yardımıyla yapılır.
     */

    @Before
    public void setUpScenarios() {
        System.out.println("Before Metot");
    }


    @After
    public void tearDownScenarios(Scenario scenario) {
        System.out.println("Afher Metotu");
//        Eger bir Scenario FAIL ederse, ekran goruntusunu al ve rapora ekle
        if (scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//                       ekran goruntusu    file tipi                  ekran goruntusunun adi
            scenario.attach(failedScreenshot, "image/png", "failed_scenario_" + scenario.getName());
            Driver.closeDriver();
        }
    }
}
