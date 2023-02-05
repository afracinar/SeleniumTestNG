package techproed.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {

    @DataProvider
    public Object[][] musteriVerileri() {
        Object[][] musteriGirisBilgileri = {
                {"maneger1", "12345","besiktas"},
                {"manager2", "9875","cebeci"},
                {"manager3", "5678","karsiyaka"}
        };
        return musteriGirisBilgileri;

    }

    @DataProvider
    public Object[][] musteriHizmetleriVerileri() {
        Object[][] musteriHizmetleriGirisBilgileri = {
                {"adam1", "3456"},
                {"ali2", "1234"},
                {"nancy3", "7890"}
        };
        return musteriHizmetleriGirisBilgileri;
    }

    @DataProvider
    public Object[][] personelVerileri() {
        Object[][] personelGirisBilgileri = {
                {"rukiye", "abc1"},
                {"mehmet", "123r"},
                {"emin", "3edc"},
                {"baran3","4546k"},
                {"okumuş4","qwe3"}
        };
        return personelGirisBilgileri;
    }

    //Excel'den DataProvider a data gelir
    //Burdan da test case'e gider

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


}
