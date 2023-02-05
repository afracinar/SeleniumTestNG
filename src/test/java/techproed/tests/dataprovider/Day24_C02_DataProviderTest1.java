package techproed.tests.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

/*
    DATA PROVIDER NEDİR?
       ==>Veri depolayıcısı,veri sağlayıcısıdır.Bir çok veriyi test case'lere loop kullanmadan aktarmak için kullanılır
       ==>Data provider 2D(2 Boyutlu) object return eder
       Data provider estNG'den gelen bir özelliktir
    DATA PROVIDER NE İÇİN KULLANILIR?
        ==>Birden fazla data kullanmamız gerektiğinde kullanılır
        ==>DDT(Data Driven Testing) için kullanılır.Birden fazla datayı testcase'lerde kullanmak için kullanılır
    DATA PROVIDER'I NASIL KULLANIRSINIZ?
        ==>@DataProvider anatasyonu ile veri havuzu oluşturulur.Test methodlarında ise data provider test methdlarına bu data havuzu dataProvider parametresi ile bağlanır
    DATA PROVIDER'DA 2 TANE PARAMETRE VARDIR:
        1)name: method ismini override etmek için yani farklı bir isim ile data provider'ı çağırmak için kullanılır
        2)paralel: paralel testcase'ler oluşturmak için kullanılır.

        not:dataları loop kullanmadan sırayla köprü gibi aktarmaktır
 */
/*
    Data provider,TestNg de olan bir özelliktir.
    TestNG de data provider methodu ile test case'lere data göndeririz.Loop kullanmadan dataları kullanabiliriz
 */

public class Day24_C02_DataProviderTest1 {

    //DATA PROVIDER
    @DataProvider(name="smoke_test_data")
    public Object[][] urunler() {

        Object urunListesi[][] = {
                {"tesla"},
                {"bmw"},
                {"mercedes"},
                {"honda"},
                {"toyota"},
                {"volvo"}
        };
        return urunListesi;
    }

    //TEST METHODU
    @Test(dataProvider = "smoke_test_data")
    public void aramaTesti(String data) {

        System.out.println(data);
    }

    //GOOGLE ARAMASI
    @Test(dataProvider = "smoke_test_data")
    public void googleAraması(String araclar) {
        //google'a git
        Driver.getDriver().get("https://www.google.com");

        //        COOKIES CIKANLAR ICIN
        try {
            Driver.getDriver().findElement(By.xpath("(//div[@class='QS5gu sy4vM'])[2]")).click();
        } catch (Exception e) {

            //araçları Arama kutusuna gir ve entera bas
            Driver.getDriver().findElement(By.name("q")).sendKeys(araclar + Keys.ENTER);
            //sayfa title'ının aradığım kelimeyi içerdiğini assert et
            Assert.assertTrue(Driver.getDriver().getTitle().contains(araclar));
            //driveri kapat
            Driver.closeDriver();
        }


    }
}
