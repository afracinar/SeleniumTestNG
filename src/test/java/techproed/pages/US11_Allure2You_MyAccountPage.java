package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class US11_Allure2You_MyAccountPage {

    public US11_Allure2You_MyAccountPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h2[text()='My Account']")
     public WebElement myAccountYazisi;

    @FindBy(xpath = "(//*[@class='icon-box text-center'])[1]")
    public WebElement ordersSecenegi;

    @FindBy(xpath = "(//*[@class='icon-box text-center'])[2]")
    public WebElement downloadsSecenegi;

    @FindBy(xpath = "(//*[@class='icon-box text-center'])[3]")
    public WebElement addressesSecenegi;

    @FindBy(xpath = "(//*[@class='icon-box text-center'])[4]")
    public WebElement accountDetailsSecenegi;

    @FindBy(xpath = "(//*[@class='icon-box text-center'])[5]")
    public WebElement wishlistSecenegi;

    @FindBy(xpath = "(//*[@class='icon-box text-center'])[6]")
    public WebElement logoutSecenegi;

    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement dashboardButon;

    @FindBy(xpath = "//a[text()='Store Manager']")
    public WebElement storeManagerbuton;

    @FindBy(xpath = "//a[text()='Orders']")
    public WebElement ordersButon;

    @FindBy(xpath = "//a[text()='Downloads']")
    public WebElement downloadsButon;

    @FindBy(xpath = "//a[text()='Addresses']")
    public WebElement addressesButon;

    @FindBy(xpath = "//a[text()='Account details']")
    public WebElement accountDetailsButon;

    @FindBy(xpath = "(//a[text()='Wishlist'])[1]")
    public WebElement wishlistButon;

    @FindBy(xpath = "//*[text()='Support Tickets']")
    public WebElement supportTicketsButon;

    @FindBy(xpath = "//*[text()='Followings']")
    public WebElement followingsButon;

    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logoutButon;
}


