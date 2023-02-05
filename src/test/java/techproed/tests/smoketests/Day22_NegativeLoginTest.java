package techproed.tests.smoketests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.C05_BlueRentalHomePage;
import techproed.pages.C06_BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day22_NegativeLoginTest {

    //Name: US100208_Negative_Login
    //Description: User should not be able login with incorrect credentials
    //Acceptance Criteria: As customer, I should not be able to log in the application
    //Customer email: fake@bluerentalcars.com
    //Customer password: fakepass
    //Error: User with email fake@bluerentalcars.com not found
    //Collapse

    C05_BlueRentalHomePage c05_blueRentalHomePage;
    C06_BlueRentalLoginPage c06_blueRentalLoginPage;
    @Test
    public void US100208_Negative_Login() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("bluerentacar_url"));

        c05_blueRentalHomePage = new C05_BlueRentalHomePage();
        c06_blueRentalLoginPage = new C06_BlueRentalLoginPage();

        c05_blueRentalHomePage.loginButton.click();
        c06_blueRentalLoginPage.emailTextBox.sendKeys(ConfigReader.getProperty("invalid_admin_email"));
        c06_blueRentalLoginPage.passwordTextBox.sendKeys(ConfigReader.getProperty("invalid_admin_password"));
        c06_blueRentalLoginPage.loginButton.click();
        Thread.sleep(5000);

        Assert.assertEquals(c06_blueRentalLoginPage.errorMessage1.getText(),"User with email fake@bluerentalcars.com not found");




    }
}
