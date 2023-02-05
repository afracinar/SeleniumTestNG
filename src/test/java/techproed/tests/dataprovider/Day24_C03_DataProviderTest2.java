package techproed.tests.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.C05_BlueRentalHomePage;
import techproed.pages.C06_BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.io.IOException;

public class Day24_C03_DataProviderTest2 {

    //    DATA PRIVIDER METOTU
    @DataProvider
    public Object[][] customerData(){

        Object[][] musteriBilgileri = {
                {"sam.walker@bluerentalcars.com", "c!fas_art"},
                {"kate.brown@bluerentalcars.com", "tad1$Fas"},
                {"raj.khan@bluerentalcars.com","v7Hg_va^" },
                {"pam.raymond@bluerentalcars.com", "Nga^g6!"}
        };
        return musteriBilgileri;
    }
    //    TEST
    @Test(dataProvider = "customerData")
    public void dataProviderTest(String email, String password){
        System.out.println("EMAIL : "+email+" | SIFRE : "+password);
    }


    //     BU 4 CUSTOMER DATALARI İLE LOGİN TESTİ YAPALIM

    C05_BlueRentalHomePage blueRentalHomePage;
    C06_BlueRentalLoginPage blueRentalLoginPage;
    @Test(dataProvider = "customerData")
    public void dataProviderLoginTest(String email,String password) throws IOException {


        //        Sayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));//HOME SAYFASINA
        blueRentalHomePage= new C05_BlueRentalHomePage();
        blueRentalLoginPage = new C06_BlueRentalLoginPage();
        blueRentalHomePage.loginButton.click();
        ReusableMethods.waitFor(1);// 1 saniye bekle
        blueRentalLoginPage.emailTextBox.sendKeys(email);
        ReusableMethods.waitFor(1);
        blueRentalLoginPage.passwordTextBox.sendKeys(password);
        ReusableMethods.waitFor(1);
        blueRentalLoginPage.loginButton.click();
        //            GIRIS YAPILDI
        ReusableMethods.waitFor(1);
        ReusableMethods.verifyElementDisplayed(blueRentalHomePage.userID);//ASSERTION
        ReusableMethods.waitFor(1);
        ReusableMethods.getScreenshot("EkranGoruntusu");
        ReusableMethods.waitFor(1);
        blueRentalHomePage.userID.click();
        ReusableMethods.waitFor(1);
        blueRentalHomePage.logOutLink.click();
        ReusableMethods.waitFor(1);
        blueRentalHomePage.OK.click();
    }

}
