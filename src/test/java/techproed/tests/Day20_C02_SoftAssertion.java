package techproed.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day20_C02_SoftAssertion {

    /*
         Her bir test case için bir Assertion veya Verification kullanmalıyız.
         TestNG'de iki çeşit Asertion yapmak mümkündür
           1)JUnitte kullandığımız sekilde Assert Class'ından methodlar kullanarak yapmak (Hard assertion)
           2)JUnit'te olmayan TestNG'ye özel olarak kullanabileceiğimiz SoftAssert Class'ından methodlar kullanarak yapmak (Soft assertiion)
           Biz hard'ı tercih edicez.

         HARD ASSERTİON:
           JUnit'te öğrendiğimiz Asertion ile aynıdır.Junit'te bildiğimiz üzere en çok kullandığımız assertionlar:
             Assert.assertEquals()
             Assert.assertTrue()
             Assert.assertFalse()

          SOFT ASSERT(VERIFICATİON):
            Assert failed olsa bile test methodunun istediğiniz kısmını durdurmaz ve yürütmeye devam eder

            1.ADIM: Obje oluşturulur
                SoftAssert softAssert = new SoftAssert();
            2.ADIM: istediğimiz sayıda verificationları yapalım
                softAssert.assertTrue();
                softAssert.assertFalse(); ...
            3.ADIM: SoftAssert'ın durumu raporlamasını isteyelim
                 softAssert.assertAll();

         Hard ve Soft assertion arasındaki farklar:
             Hard assertion fail olursa methodlarının execute etmesi durur.Ve FAİL olarak tanımlanır
             Eğer softAsserrt FAIL olursa test methodları execute etmeye devam eder.assertAll dediğimizde FAILED olan assertion varsa execution durur

         Hard ve Soft assertion arasındaki ortak özellikler:
          SoftAssert ile HardAssert methodları TestNG'den gelmektedir
          Kullanma amaçları farklı olsa da methodlar aynıdır
     */

    @Test
    public void softAssertTest(){

        //1.ADIM: Softassert objesi oluştur:
        SoftAssert softAssert = new SoftAssert();

        System.out.println("Satır 41");
        softAssert.assertEquals(5,2); //FAİL
        System.out.println("Satır 43");
        softAssert.assertTrue("JAVA".contains("U")); //FAİL
        System.out.println("Satır 45");
        softAssert.assertTrue(true);
        System.out.println("Satır 47");
        softAssert.assertAll(); //assertAll() methodunu kullanmamız şart.PAS yada FAIL olarak assertionları işaretler.eğer kullanmazsak tüm testlerimiz geçiyor
                               //fail'den sonra da test case'ler çalışmaya devam ediyor
    }
}
