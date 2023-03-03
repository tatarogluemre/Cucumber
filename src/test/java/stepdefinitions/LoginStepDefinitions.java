package stepdefinitions;

import io.cucumber.java.en.When;
import pages.HomeWorkBlueRentalCarPages;

import java.util.List;
import java.util.Map;

public class LoginStepDefinitions {
    HomeWorkBlueRentalCarPages pages = new HomeWorkBlueRentalCarPages();
    @When("kullaci email ve sifresini girer")
    public void kullaci_email_ve_sifresini_girer(io.cucumber.datatable.DataTable dataTable) {
        // 1. List<String> olarak dataları depolayabiliriz.
//            List<String> musteriBilgileri= dataTable.row(1);
//            System.out.println(musteriBilgileri.get(0));
//            System.out.println(musteriBilgileri.get(1));
//            pages.email.sendKeys(musteriBilgileri.get(0));
//            pages.password.sendKeys(musteriBilgileri.get(1));

        //2. DataTable da List<Map<String ,String>> de depolayabiliriz.
        List<Map<String ,String>> musteriBilgisi = dataTable.asMaps(String.class,String.class);
        for(Map<String,String> data : musteriBilgisi){

            pages.email.sendKeys(data.get("email"));
            pages.password.sendKeys(data.get("sifre"));


        }

    }
}
