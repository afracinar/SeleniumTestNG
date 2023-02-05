package techproed.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.C03_TechproLoginPage;
import techproed.pages.C04_TechproHomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day21_C02_TechproLoginTest {

    @Test(groups = "regression-tests")
    public void techproEducationTest() throws InterruptedException {

        //adrese git
        Driver.getDriver().get(ConfigReader.getProperty("techpro_test_url"));

        C03_TechproLoginPage c03_techproLoginPage = new C03_TechproLoginPage();
        c03_techproLoginPage.userName.sendKeys(ConfigReader.getProperty("techpro_test_username"));
        Thread.sleep(3000);
        c03_techproLoginPage.password.sendKeys(ConfigReader.getProperty("techpro_test_password"));
        Thread.sleep(3000);
        c03_techproLoginPage.submitButton.click();
        Thread.sleep(3000);

        //driver şuan da Home Page'de

        C04_TechproHomePage c04_techpro_homePage = new C04_TechproHomePage(); //genelde objeler en başta oluşturulur
        Assert.assertTrue(c04_techpro_homePage.yazi.isDisplayed());

        //sayfadan çıkış yap ve test et
        c04_techpro_homePage.logout.click();       //login page yazısının locate'i alındı
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[text()='Login Page']")).isDisplayed());

        Driver.closeDriver();
    }
}
