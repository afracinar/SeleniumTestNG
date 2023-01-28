package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class C01_OpenSourcePage {


     //  Page objelerini bu sınıfta buluruz.

     //  1.ADIM: Consturoctor oluşturulur.(her bir page constroctor ile başalamak zorunda
    public C01_OpenSourcePage() {
        //PageFactory selenium'dan gelen ve bu sayfa elementlerini başlangıç değeri vermek için kullanılır
        //Sayfa objeleri çağırıldığında nullpointer exception alınmaz
        PageFactory.initElements(Driver.getDriver(), this);

    }
        //    PAGE OBJELERINI OLUSTUR
       //    GELENEKSEL  : public WebElement username = Driver.getDriver().findElement(By.name("username"));
        @FindBy(name = "username")
        public WebElement username;

        @FindBy(xpath = "//input[@name='password']")
        public WebElement password;

        @FindBy(xpath = "//button[@type='submit']")
        public WebElement submitButton;



}
