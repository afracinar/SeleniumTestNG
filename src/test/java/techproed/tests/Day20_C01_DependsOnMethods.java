package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day20_C01_DependsOnMethods {

    /*
       TestNG 'de tüm @Test methodları birbirlerinden bağımsız olarak çalışırlar.
       Eğer methodları bağımlı hale getirmek istersem,depensOnMethods parametresi kullanılır.
       Aşağıdaki örnekte , searchTest methodu ,homeTest methoduna bağımlıdır
       searchTest'den önce homeTest çalışır
       Eğer homeTest başarılı ise searchTest o zaman çalışır
       Eğer homeTest başarısız ise searchTest IGNORE edilir
     */

    @Test
    public void homeTest(){

        System.out.println("Home Test");
        Assert.assertTrue(false); //FAİL
    }

    @Test(dependsOnMethods = "homeTest")
    public void searchTest(){
        System.out.println("Search Test");

    }

    @Test
    public void paymentTest(){
        System.out.println("Payment Test");

    }
}
