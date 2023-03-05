package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.BlueRentalHomePage;
import pages.BlueRentalLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelStepDefinitions {

    BlueRentalHomePage blueRentalHomePage;
    BlueRentalLoginPage blueRentalLoginPage;
    ExcelUtils excelUtils;
    List<Map<String, String>> excelDatalari;

    @Given("kullanici {string} bilgileri ile giris yapar")
    public void kullanici_bilgileri_ile_giris_yapar(String sayfaAdi) throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("blue_rental_url"));
        blueRentalHomePage = new BlueRentalHomePage();
        blueRentalLoginPage = new BlueRentalLoginPage();
        excelUtils = new ExcelUtils("src/test/resources/testdata/mysmoketestdata.xlsx", sayfaAdi);
        excelDatalari = excelUtils.getDataList();
        for (Map<String, String> data : excelDatalari) {
            blueRentalHomePage.login.click();
            blueRentalLoginPage.email.sendKeys(data.get("username"));
            blueRentalLoginPage.password.sendKeys(data.get("password"));
            blueRentalLoginPage.loginButton.click();
            ReusableMethods.waitFor(2);
            Assert.assertTrue(blueRentalHomePage.userID.isDisplayed());
            ReusableMethods.waitFor(2);
            ReusableMethods.getScreenshot("Login");
            blueRentalHomePage.userID.click();
            blueRentalHomePage.logOutLink.click();
            ReusableMethods.waitFor(2);
            blueRentalHomePage.okButton.click();
            ReusableMethods.waitFor(2);

        }
        Driver.closeDriver();


    }


}
