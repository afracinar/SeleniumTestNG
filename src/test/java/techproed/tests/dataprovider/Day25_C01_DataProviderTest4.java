package techproed.tests.dataprovider;

import org.testng.annotations.Test;
import techproed.utilities.DataProviderUtils;

public class Day25_C01_DataProviderTest4 {

    //Bu örnekte, Data Provider methodumuz Util classdan gelecek.Data provider'ı bu sınıfta oluşturmayacağız.
    //Page Object Model'da tercih edilen tests package lerinde yani test sınıflarında sadece test case'lerin olmasıdır.Data provider'lar test case
      //olmadığı için bunları Util class'ına aldık,oradan çağırdık
    //data provider'ı başka yerden çağırırken extend,obje vs kullanmayız.direkt parantez içinde nerden çağırdığımızı belirtiriz.
    // "dataProviderClass" ı başka bir sınıftan data çekmek için kullanıyoruz
    //Test annotation'ları çalışırken national order'a göre çalışır yani methodların alfabetik sırasına göre çalışır

    //musteriVerileri'ndn data çekecek
    @Test(dataProvider = "musteriVerileri",dataProviderClass = DataProviderUtils.class)
    public void musteriVerileriTest(String username,String password,String sube){ //data provider 3 parametreli olduğu için 3 parametre girdik

        System.out.println("Username :"+username+ ". Password :"+password+". Sube :"+sube);

    }

    //musteriHizmetleriVerileri
    @Test(dataProvider = "musteriHizmetleriVerileri",dataProviderClass = DataProviderUtils.class)
    public void musteriHizmetleriVerileriTest(String username, String password){

        System.out.println("Username :"+username+ ". Password :"+password);

    }

    //personelVerileri
    @Test(dataProvider = "personelVerileri",dataProviderClass = DataProviderUtils.class)
    public void personelVerileriTest(String username, String password){

        System.out.println("Username :"+username+ ". Password :"+password);

    }

    // customerData methodundan data çekiyoruz.
    @Test(dataProvider = "customerData",dataProviderClass = DataProviderUtils.class)
    public void customerDataTest(String username,String password){
        System.out.println("Excel Datalarım");
        System.out.println(username+" --- "+password);
    }
}
