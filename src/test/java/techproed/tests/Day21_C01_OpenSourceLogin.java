package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.C02_OpenSourceDashboradPage;
import techproed.pages.C01_OpenSourcePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day21_C01_OpenSourceLogin {

    @Test
    public void openSourceLogin(){

      //1.ADIM: SAYFAYA GİT
        //uzun yol: Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Driver.getDriver().get(ConfigReader.getProperty("open_source_url"));

      //2.ADIM: PAGE OBJESİ OLUŞTUR
        C01_OpenSourcePage openSourcePage = new C01_OpenSourcePage();

       //3.ADIM: OBJEYİ KULLANARAK O SINIFTAKİ OBJELERE ULAŞ
          //dinamik değil : openSourcePage.username.sendKeys("Admin");
        openSourcePage.username.sendKeys(ConfigReader.getProperty("open_source_username"));
          //dinamik değil: openSourcePage.password.sendKeys("admin123");
        openSourcePage.password.sendKeys(ConfigReader.getProperty("open_source_password"));
        openSourcePage.submitButton.click();

        //4.ADIM: ASSERTİON YAP(BİR ŞEYİN GÖRÜNÜRLÜĞÜNÜ DOĞRULAYABİLİRİZ SAYFANIN AÇILDIĞINI ANLAMAK İÇİN
          //dashboard sayfası login sayfasından farklı olduğu için ayrı bir page oluşturduk
        C02_OpenSourceDashboradPage openSourceDashboradPage = new C02_OpenSourceDashboradPage();
        Assert.assertTrue(openSourceDashboradPage.dashboardHeader.isDisplayed());


    }


}
