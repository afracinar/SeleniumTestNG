package techproed.tests.smoketests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import techproed.pages.C05_BlueRentalHomePage;
import techproed.pages.C06_BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day22_PozitiveLoginTest {

    //Name: US100201_Admin_Login
    //Description: Admin bilgileriyle giriş
    //Acceptance Criteria: Admin olarak, uygulamaya giriş yapabilmeliyim
    //https://www.bluerentalcars.com/
    //Admin email: jack@gmail.com
    //Admin password: 12345


    C05_BlueRentalHomePage c05_blueRentalHomePage;
    C06_BlueRentalLoginPage c06_blueRentalLoginPage;
    @Test
    public void US100201_Admin_Login() throws InterruptedException {
        Reporter.log("sayfaya git");
        Driver.getDriver().get(ConfigReader.getProperty("bluerentacar_url"));

        c05_blueRentalHomePage = new C05_BlueRentalHomePage();
        Reporter.log("login butonuna tıkla");

        c05_blueRentalHomePage.loginButton.click();

        c06_blueRentalLoginPage = new C06_BlueRentalLoginPage();
        Reporter.log("giriş bilgilerini gir");

        c06_blueRentalLoginPage.emailTextBox.sendKeys(ConfigReader.getProperty("admin_email"));
        Thread.sleep(5000);
        c06_blueRentalLoginPage.passwordTextBox.sendKeys(ConfigReader.getProperty("admin_password"));
        Thread.sleep(5000);
        c06_blueRentalLoginPage.loginButton.click();                             //giriş yaptıktan sonra isim yerinin locate'ini aldık
        Reporter.log("giriş yapıldığını doğrula");
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@id='dropdown-basic-button']")).isDisplayed());
    }
}
