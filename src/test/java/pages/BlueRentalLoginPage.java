package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentalLoginPage {
    public  BlueRentalLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement assertNotLogin;
}
