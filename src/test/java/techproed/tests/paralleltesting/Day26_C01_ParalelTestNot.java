package techproed.tests.paralleltesting;

public class Day26_C01_ParalelTestNot {

    /*
      PARALEL TEST
      Paralel test aynı anda birden fazla test case'i eşzamanlı olarak çalıştırmak demektir.
      Paralel test çalışma süresini azaltır,dolayısıyla zaman kazanmak için paralel test kullanılır
      SEQUENTİAL TEST ==> testcase'lerin sırayla çalıştırılan testlerdir
      Aklımızda kalması gereken 2 kelime:
        parallel (paralel test için kullanılır)
        thread-count(tarayıcı sayısı) yani 3 dersek 3 farklı tarayıcıda testcase'ler çalışır

        Paralel test nasıl yapılır? 2 farklı yolla yapılır
        -TestNG'de paralel test, testNG xml dosyası kullanılarak yapılır.
        -Data Provider ile de aynı şekilde paralel test yapılabilir.Bu kısıtlı bir yöntemdir.

     */

    /*
    1.paralleltesting klasörü oluştur
    2.en az 2 adet test sınıfı oluştur(biz 3 adet oluşturduk)
    3.paralel test için yeni bir xml dosyası oluştur. (biz paralleltest.xml adında oluşturduk)
    4.Paralel test yapılabilmesi için tek yapmamız gereken xml dosyasına su kelimeleri eklemek:
      *parallel
      *thread-count
      <suite name="All Test Suite" parallel="classes" thread-count="3">
      Bu durumda, bu xml dosyamı çalıştırdığımda test case'lerim parallel bir şekilde aynı anda çalışacaktır
     */
}
