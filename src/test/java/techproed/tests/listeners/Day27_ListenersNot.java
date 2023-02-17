package techproed.tests.listeners;

public class Day27_ListenersNot {

    /*
       LİSTENERS
       TestNG'deki davranışları değiştirmek,modifiye etmek için kullanılır.
       ITestListeners tki methodları tercih ederiz.(7 tane)
       ya testcase içinde ya da xml dosyasında kullanılır

       Listeners Nedir?
       *TestNg Listeners'lar  selenium kodlarını DİNLEMEK için kullanılır. (listeners=dinleyici)
       Listeners'lar yardımıyla testcase sonuçlarını,hata mesajlarını ya da testlerin başlama,bitme,geçme(pass) veya kalma(fail) durumlarını dinleyebiliriz.

       Listeners Neden Kullanılır?
       Test Automasyondaki PASS,FAIL,SKIP,ERROR durumlarında raporlamalar için (test fail ettiğinde ekran görüntüsü al gibi)
       Loglama(mesaj yazdırma) işlemleri için

       Listeners sadece TestNG ye aittir.
       7 taane listeners'a ait methodumuz var:
         -onStart() ==> tüm testlerden ÖNCE tek bir sefer çalışır (@BeforeSuite benzeri)
         -onFinish() ==> tüm testlerden SONRA tek bir sefer çalışır
         -onTestStart() ==> her bir @Test annocationundan ÖNCE birer sefer çalışır
         -onTestSuccess() ==> sadece pass eden testlerden hemen SONRA çalışır
         -onTestFailure() ==> sadece fail eden testlerden hemen SONRA çalışır
         -onTestSkipped() ==2 ıgnore edilen testlerden hemen SONRA çalışır
         -onTestFailedButWithinSuccessPercentage() ==> belirli bir test fail sonrası çalışır.Mesela testlerin 30% u kalırsa bu methodu çağır gibi limit koyabiliriz

    **** Test class'lar ile Listener'ları ilişkilendirmenin 2 yolu vardır:
         1) @Listeners annocation : @Listeners(techproed.utilities.Listeners.class) (Bu sadece ilişkilendirdiğimiz class için geçerli olur.
            Her class a tek tek girip annocation yaparak listeners ile ilişkilendirmemiz zahmetlidir.Bunun için xml oluşturmak iyidir)
         2) Xml file : listeners tagını xml file'ı ile kullan(
     */
}
