package techproed.utilities;

import java.io.FileInputStream;
import java.util.Properties;
//INTERVİEW: STATIC NEDİR,NEREDE KULANDIN? CONFIGREADER DA KULLANDIM

public class ConfigReader {

    //Bu sınıf configuration.properties file'ı okumak için kullanılır
    //property file'ı okumak için prperti objesi kullanılır
    private static Properties properties;
    //statick block : bu sınıfı çağırır çağırmaz ilk bu kısım çalışır
    static {
        //data çekmek istediğim dosyanın path'i
        String path="configuration.properties";
        try {
            //configiration.property doyasını açar
            FileInputStream fileInputStream = new FileInputStream(path);
            //properties objesini instantiate ediyoruz.
            properties = new Properties();
            //configuration.property dosyasındaki dataları yükler
            properties.load(fileInputStream);
            //close the file
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //ConfigReader.gtProperty("browser"); -> chrome
    //ConfigReader.gtProperty("amazon_url"); -> https://www.amazon.com
    //ConfigReader.gtProperty("username"); -> ali
    public static String getProperty(String key){
        String value=properties.getProperty(key);
        return value;
    }

}
