package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class US11_Allure2You_HomePage {

    public US11_Allure2You_HomePage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Sign In '] ")
    public WebElement signIn;

    @FindBy(xpath = "(//*[@id='username'])[1]")
    public WebElement usernameOrEmail;

    @FindBy(xpath = "(//*[@id='password'])[1]")
    public WebElement password;

    @FindBy(xpath = "//button[text()='Sign In']")
    public WebElement signInButon;
}



