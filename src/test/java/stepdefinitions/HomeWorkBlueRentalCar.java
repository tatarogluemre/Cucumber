package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomeWorkBlueRentalCarPages;
import utilities.Driver;

public class HomeWorkBlueRentalCar {

    HomeWorkBlueRentalCarPages homeWork = new HomeWorkBlueRentalCarPages();

    @Given("kullanici {string} ana sayfaya gider")
    public void kullanici_ana_sayfaya_gider(String string) {
        Driver.getDriver().get(string);
    }

    @When("kullanici login sayfasina gider")
    public void kullanici_login_sayfasina_gider() {
        homeWork.login.click();
    }

    @When("kullanıcı adini {string} girer")
    public void kullanıcı_adini_girer(String string) {
        homeWork.email.sendKeys(string);
    }

    @When("sifreyi {string} girer")
    public void sifreyi_girer(String string) {
        homeWork.password.sendKeys(string);
    }

    @When("login buttonuna basar")
    public void login_buttonuna_basar() {
      homeWork.loginButton.click();
    }
    @Then("login islemi gerceklestigini dogrular")
    public void login_islemi_gerceklestigini_dogrular() {
        assert homeWork.verifyLogin.isDisplayed();
    }


}
