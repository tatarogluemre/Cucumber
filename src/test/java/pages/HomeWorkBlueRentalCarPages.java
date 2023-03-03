package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomeWorkBlueRentalCarPages {
    public HomeWorkBlueRentalCarPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement login;

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement loginButton;

    @FindBy(id = "dropdown-basic-button")
    public WebElement verifyLogin;
}
