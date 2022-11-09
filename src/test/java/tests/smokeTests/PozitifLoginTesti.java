package tests.smokeTests;

import org.testng.annotations.Test;
import pages.MyCoursedemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PozitifLoginTesti {
    //Mycoursedemy anasayfasina gidin
    //login linkine basin
    //Kullanici email'i olarak valid email girin
    //Kullanici sifresi olarak valid sifre girin
    //Login butonuna basarak login olun
    //Basarili olarak giris yapildiginni test edin

    @Test
    public void pozitifloginTesti(){
        //Mycoursedemy anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        //login linkine basin
        MyCoursedemyPage myCoursedemyPage=new MyCoursedemyPage();
        myCoursedemyPage.loginlinki.click();

        //Kullanici email'i olarak valid email girin
        myCoursedemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("myGecerliEmail"));

        //Kullanici sifresi olarak valid sifre girin
        myCoursedemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("myGecerliPassword"));

        //Login butonuna basarak login olun
        myCoursedemyPage.loginButonu.click();

        //Basarili olarak giris yapildiginni test edin


    }
}
