package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePages {

    public GooglePages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='QS5gu sy4vM'])[2])")
    public WebElement popupAccept;

    @FindBy(name = "q")
    public WebElement searchBox;

}
