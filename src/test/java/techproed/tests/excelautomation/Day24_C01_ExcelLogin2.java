package techproed.tests.excelautomation;

import org.testng.annotations.Test;

import techproed.pages.C05_BlueRentalHomePage;
import techproed.pages.C06_BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;
import techproed.utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;
import java.util.Map;
public class Day24_C01_ExcelLogin2 {

    C05_BlueRentalHomePage blueRentalHomePage;
    C06_BlueRentalLoginPage blueRentalLoginPage;
    //    Bu metot login sayfasina gitmek icin kullanililacak
    ExcelUtils excelUtils;
    List<Map<String, String>> excelDatalari;
    @Test
    public void customerLogin() throws IOException {
        String path="./src/test/java/resources/mysmoketestdata.xlsx";
        String sayfa = "customer_info";
        excelUtils=new ExcelUtils(path,sayfa);
        excelDatalari=excelUtils.getDataList();
        Driver.getDriver().get(ConfigReader.getProperty("bluerentacar_url"));
//        home page logine tikla
        for (Map<String,String> data:excelDatalari) {
            //        Sayfaya git
            Driver.getDriver().get(ConfigReader.getProperty("bluerentacar_url"));
            blueRentalHomePage= new C05_BlueRentalHomePage();
            blueRentalLoginPage = new C06_BlueRentalLoginPage();
            blueRentalHomePage.loginButton.click();
            ReusableMethods.waitFor(1);// 1 saniye bekle
            ReusableMethods.waitFor(1);
            blueRentalLoginPage.emailTextBox.sendKeys(data.get("admin_email"));
            ReusableMethods.waitFor(1);
            blueRentalLoginPage.passwordTextBox.sendKeys(data.get("admin_password"));
            ReusableMethods.waitFor(1);
            blueRentalLoginPage.loginButton.click();
            ReusableMethods.waitFor(1);

            //giriş yapıldı
            ReusableMethods.verifyElementDisplayed(blueRentalHomePage.userID);
            ReusableMethods.getScreenshot("EkranGoruntusu");
            blueRentalHomePage.userID.click();
            ReusableMethods.waitFor(1);
            blueRentalHomePage.logOutLink.click();
            ReusableMethods.waitFor(1);
            blueRentalHomePage.OK.click();
        }
        Driver.closeDriver();
    }
}
