package techproed.tests.dataprovider;

public class Day25_C02_XMLFileOlusturma {

    /*    XML FILE OLUŞTURMA:

          XML,hem insanların hem de makinaların okuyabileceği belgeleri kodlamak için oluşturulan bir biçimlendirme dilidir
          Veri saklamak,okumak,farklı işletim sistemleri arasında veri transfer etmek için kullanılan .xml formatına sahip dosyalarda saklanır
          Biz de framwork'ümüzdeki belirli testleri veya tüm testleri otomatik olarak çalıştırmak için xml dosyaları kullanırız

          XML; properties,excel,word gibi bir dosya tipidir.
      *** XML daha çok ayar yapmada kullanılır.
          İstediğimiz seviyedeki test'leri çalıştırabiliriz.package,method,class vs..

          TestNG'de XML dosyaları çok önemlidir.
          Paralel test'ler xml dosyalarıyla yapılır.

                                                                              (suit proje seviyesidir,tüm testcase'leri içerir yani run ettiğin her şey)
          TestNG framwork'ünde xml dosyası kullanma nedenlerinden biri belirli suitleri,testleri,package'leri,class'ları veya method'ları çalıştırmaktır
      *** Belirli testleri,package'leri,class'ları veya method'ları dahil edebilir(include) veya hariç(exclude) tutabiliriz.Bu da bize testcase'leri
          çalıştırırken esneklik kazandırır.include ve exclude methodlar ve gropuplara özel bir şeydir.class'larda kullanılmaz
          xml dosyasında belirli taglar kullanılır.xml dosyaları oluştururken hiyerarşi (büyükten küçüğe sıralama) önemlidir.Her zaman suite'den başlayıp
          hangi seviyede test çalıştırmak istersek o seviyeye kadar sıralı olarak kademeleri yazmalıyız
            suite -> test -> (classes-packages-groups)

          xml oluşturma:
          proje seviyesinde sağ tık-->New-->File-->file adı ".xml" uzantılı olmalı
          "<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >" her xml dosyasının ilk satırına eklenmeli
          İşlemler yapıldıktan sonra "SAVE" yapılmalı,kaydedilmeli

          Birden fazla package run edilebilir

          group'ları run etmek istediğimiz testcase'lerin yanına (groups = "isim") yazılır ve bunlar grup halinde run edilir


     */
}
