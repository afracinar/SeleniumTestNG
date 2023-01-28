package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class C03_TechproLoginPage {

    public C03_TechproLoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='exampleInputEmail1']")
    public WebElement userName;

    @FindBy(xpath = "//*[@id='exampleInputPassword1']")
    public WebElement password;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement submitButton;
}
