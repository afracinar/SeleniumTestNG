package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class C04_TechproHomePage {

    public C04_TechproHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
        @FindBy(xpath = "//*[@role='alert']")
        public WebElement yazi;

        @FindBy(xpath = "//*[@class='btn btn-dark']")
        public WebElement logout;
}
