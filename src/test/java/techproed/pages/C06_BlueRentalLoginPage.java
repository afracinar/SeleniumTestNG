package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class C06_BlueRentalLoginPage {

    public C06_BlueRentalLoginPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='formBasicEmail']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//*[@id='formBasicPassword']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@role='alert']")
    public WebElement errorMessage1;
}
