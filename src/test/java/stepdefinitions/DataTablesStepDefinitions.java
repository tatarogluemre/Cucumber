package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPages;
import utilities.Driver;

public class DataTablesStepDefinitions {

    DataTablesPages dataTables = new DataTablesPages();

    @Given("kullanici {string} gider")
    public void kullanici_gider(String string) {
        Driver.getDriver().get(string);
    }

    @When("kullanici new butonuna tiklar")
    public void kullanici_new_butonuna_tiklar() {

        dataTables.newButton.click();
    }

    @When("kullanici first name {string} girer")
    public void kullanici_first_name_girer(String string) {

        dataTables.firstName.sendKeys(string);
    }

    @When("kullanici last name {string} girer")
    public void kullanici_last_name_girer(String string) {

        dataTables.lastName.sendKeys(string);
    }

    @When("kullanici positions {string} girer")
    public void kullanici_positions_girer(String string) {

        dataTables.position.sendKeys(string);
    }

    @When("kullanici office {string} girer")
    public void kullanici_office_girer(String string) {

        dataTables.office.sendKeys(string);
    }

    @When("kullanici extension {string} girer")
    public void kullanici_extension_girer(String string) {

        dataTables.extension.sendKeys(string);
    }

    @When("kullanici start_date {string} girer")
    public void kullanici_start_date_girer(String string) {

        dataTables.startDate.sendKeys(string);
    }

    @When("kullanici salary {string} girer")
    public void kullanici_salary_girer(String string) {

        dataTables.salary.sendKeys(string);
    }

    @When("kullanici create butonuna basar")
    public void kullanici_create_butonuna_basar() {

        dataTables.createButton.click();
    }
    @When("kullanici firstname ile {string} arama yapar")
    public void kullanici_firstname_ile_arama_yapar(String string) {
       dataTables.search.sendKeys(string);
    }
    @Then("kullanici gelen sonuclarda name alaninda {string} icerdigini dogrular")
    public void kullanici_gelen_sonuclarda_name_alaninda_icerdigini_dogrular(String string) {
          Driver.waitForVisibility(dataTables.verifyName,15);
          Assert.assertTrue(dataTables.verifyName.getText().contains(string));
    }


}
