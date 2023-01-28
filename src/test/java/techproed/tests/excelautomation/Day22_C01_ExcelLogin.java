package techproed.tests.excelautomation;

import org.testng.annotations.Test;
import techproed.pages.C05_BlueRentalHomePage;
import techproed.pages.C06_BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;
import techproed.utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

public class Day22_C01_ExcelLogin {

    C05_BlueRentalHomePage blueRentalHomePage;
    C06_BlueRentalLoginPage blueRentalLoginPage;
    ExcelUtils excelUtils;
    List<Map<String,String>> excelDatalari;

    //bu method login sayfasına gitmek için kullanılacaktır
    public void login(){

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
        }catch (Exception e){
        }

 //      SONRAKİ GİRİŞLER
        try{
            //Kullanıcı ID'ye tıkla   ---->> try catch
            blueRentalHomePage.userID.click();

            //LogOut butonuna tıkla     ---->> try catch
            blueRentalHomePage.logOutLink.click();
            //OK'a tıkla               ---->> try catch
            blueRentalHomePage.OK.click();
            //Login butonuna tıkla         ---->> try catch
            blueRentalHomePage.loginButton.click();
        }catch (Exception e){

        }

    }
    @Test
    public void customerLogin(){

        String path = "./src/test/java/resources/mysmoketestdata.xlsx"; //excel yolunu aldık
        String sheetName ="customer_info"; //bu sayfadaki dataları alacağız

        //Dataları excel utils metotları kullanarak buraya alacaz
        excelUtils=new ExcelUtils(path,sheetName);

        
    }

    /*
            sam.walker@bluerentalcars.com	c!fas_art
            kate.brown@bluerentalcars.com	tad1$Fas
            raj.khan@bluerentalcars.com	v7Hg_va^
            pam.raymond@bluerentalcars.com	Nga^g6!

            -----------
            Home page'deyiz
            Home Page'deki login'e tıkla
            LOgin page deyiz
            Kullanıcı adını gir(excelden alacağız)
            kullanıcı şifresini gir (excelden alacağız)
            login page'deki login butonuna tıkla
            -------------
            Home Page'deyiz
            Kullanıcı ID'sine tıkla
            Logout linkine tıkla
            OK'a tıkla
            (burdan itibaren süreç tekrarlanıyor)
            Home Page'deki login'e tıkla
            LOgin page deyiz
            Kullanıcı adını gir(excelden alacağız)
            kullanıcı şifresini gir (excelden alacağız)
            login page'deki login butonuna tıkla

     */
}
