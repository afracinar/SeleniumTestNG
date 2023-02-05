package techproed.tests.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.C05_BlueRentalHomePage;
import techproed.pages.C06_BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;
import techproed.utilities.ReusableMethods;

import java.io.IOException;

public class Day24_C04_DataProviderTest3 {


        //EXCEL DATALARI -> DATA PROVIDER -> TEST METOTLARI
        //    DATA PRIVIDER METOTU
        @DataProvider
        public Object[][] customerData(){
//        DataProviderTest2 ile bu metot arasindaki tek fark bu metotda datalar Excelden gelir.
//        Bu kullanim daha guzeldir
            String path="./src/test/java/resources/mysmoketestdata.xlsx";
            String sheetName = "customer_info";
            ExcelUtils excelUtils = new ExcelUtils(path,sheetName);
            Object[][] musteriBilgileri = excelUtils.getDataArrayWithoutFirstRow();
            return musteriBilgileri;
        }
        //    BU 4 CUSTOMER DATALARI ILE LOGIN TESTI YAPALIM
        C05_BlueRentalHomePage blueRentalHomePage;
        C06_BlueRentalLoginPage blueRentalLoginPage;
        @Test(dataProvider = "customerData")
        public void dataProviderLoginTest(String email, String sifre) throws IOException {
            //        Sayfaya git
            Driver.getDriver().get(ConfigReader.getProperty("app_url"));//HOME SAYFASINA
            blueRentalHomePage= new C05_BlueRentalHomePage();
            blueRentalLoginPage = new C06_BlueRentalLoginPage();
            blueRentalHomePage.loginButton.click();
            ReusableMethods.waitFor(1);// 1 saniye bekle
            blueRentalLoginPage.emailTextBox.sendKeys(email);
            ReusableMethods.waitFor(1);
            blueRentalLoginPage.passwordTextBox.sendKeys(sifre);
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
            Driver.closeDriver();
        }
    }

