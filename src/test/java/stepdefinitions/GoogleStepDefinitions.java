package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePages;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefinitions {
    GooglePages googlePages = new GooglePages();
    @Given("kullanici google gider")
    public void kullanici_google_gider() {
       Driver.getDriver().get(ConfigReader.getProperty("google_url"));
//      çerez çıkması durumunda kullanılabilir.
//       try{
//           googlePages.popupAccept.click();
//       }catch(Exception e){
//             }
    }
    @When("kullanici iphone için arama yapar")
    public void kullanici_iphone_için_arama_yapar() {

        googlePages.searchBox.sendKeys("iphone", Keys.ENTER);


    }
    @Then("kullanici sonuclarda iphone olduğunu dogrular.")
    public void kullanici_sonuclarda_iphone_olduğunu_dogrular() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("iphone"));

    }
    @Then("close the applications")
    public void close_the_applications(){

        Driver.closeDriver();
    }
    @When("kullanici tesla icin arama yapar")
    public void kullanici_tesla_icin_arama_yapar() {
        googlePages.searchBox.sendKeys("tesla",Keys.ENTER);
    }
    @Then("sonuclarda tesla oldugunu dogrular")
    public void sonuclarda_tesla_oldugunu_dogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("tesla"));
    }

    @When("kullanici {string} icin arama yapar")
    public void kullanici_icin_arama_yapar(String string) {
        googlePages.searchBox.sendKeys(string, Keys.ENTER);

    }
    @Then("kullanici sonuclarda {string} oldugunu dogrular.")
    public void kullanici_sonuclarda_oldugunu_dogrular(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

}
