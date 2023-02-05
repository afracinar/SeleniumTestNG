package techproed.tests.excelautomation;

import org.testng.annotations.AfterMethod;
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

public class Day23_C01_ExcelLogin {

    C05_BlueRentalHomePage blueRentalHomePage;
    C06_BlueRentalLoginPage blueRentalLoginPage;
    ExcelUtils excelUtils;
    List<Map<String, String>> excelDatalari;

    //bu method login sayfasına gitmek için kullanılacaktır
    public void login() {

        //Sayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("bluerentacar_url"));

        //Home Page'deki login elementine tıkla
        blueRentalHomePage = new C05_BlueRentalHomePage();
        blueRentalLoginPage = new C06_BlueRentalLoginPage();
        //        ------SADECE ILK GIRIS-------
//        loginLink butonu sadece ilk giriste sayfada gorunur
//        Ikinci ve ucuncu girislerde sayfada gorunmeyeceginden NoSuchElementException alinir
//        Biz bu exception'i try-catch kullanarak yakalariz ve test case calismaya devam eder
        try {
            blueRentalHomePage.loginButton.click();
            ReusableMethods.waitFor(1);// 1 saniye bekle
        } catch (Exception e) {
        }

        //      SONRAKİ GİRİŞLER
        try {
            //Kullanıcı ID'ye tıkla   ---->> try catch
            blueRentalHomePage.userID.click();

            //LogOut butonuna tıkla     ---->> try catch
            blueRentalHomePage.logOutLink.click();
            //OK'a tıkla               ---->> try catch
            blueRentalHomePage.OK.click();
            //Login butonuna tıkla         ---->> try catch
            blueRentalHomePage.loginButton.click();
        } catch (Exception e) {

        }

    }

    @Test
    public void customerLogin() throws IOException {

        String path = "./src/test/java/resources/mysmoketestdata.xlsx"; //excel yolunu aldık
        String sheetName = "customer_info"; //bu sayfadaki dataları alacağız

        //Dataları excel utils metotları kullanarak buraya alacaz
        excelUtils = new ExcelUtils(path, sheetName);

        //excel datalarını getDataList methodu ile çekelim
        excelDatalari = excelUtils.getDataList();

        //Loop kullanarak dataları tek tek test casede kullan
        for (Map<String, String> data : excelDatalari) {

            login(); //her loopda login sayfasına götürecek

            //kullanıcı adını gir
            ReusableMethods.waitFor(2);
            blueRentalLoginPage.emailTextBox.sendKeys(data.get("username"));
            //kullanıcı şifresini gir
            ReusableMethods.waitFor(2);
            blueRentalLoginPage.passwordTextBox.sendKeys(data.get("password"));
            //login butonuna tıkla
            ReusableMethods.waitFor(2);
            blueRentalLoginPage.loginButton.click();
            ReusableMethods.waitFor(2);

            ReusableMethods.verifyElementDisplayed(blueRentalHomePage.userID); //giriş işleminin başarılı olduğunu göstermek için assertion yaptık
            ReusableMethods.waitFor(2);
            ReusableMethods.getScreenshot("EkranGoruntusu"); //ekran görüntüsü aldık
        }
    }
    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}

    /*
            sam.walker@bluerentalcars.com	c!fas_art
            kate.brown@bluerentalcars.com	tad1$Fas
            raj.khan@bluerentalcars.com	v7Hg_va^
            pam.raymond@bluerentalcars.com	Nga^g6!

       */