package tests.day19_dataProvider_crossBrowserTesting;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.MyCoursedemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_NegativeLoginDataProvider {
    @DataProvider
    public static Object[][] kullaniciDataProvider() {

        Object[][] kullaniciBilgileri={{"abc@gmail.com","12345"}
                ,{"gfre@gmail.com","12455"}
                ,{"abcde@gmail.com","5hfgt"}
                ,{"soner@gmail.com","9jdgfr"}
                ,{"Fatih@gmail.com","jhhgf65"}
                ,{"Nevzat@gmail.com","6645gd"}
                ,{"Murat@gmail.com","7fghrt"}
                ,{"Ahmet@gmail.com","hfgdt"}
                ,{"yghdr48@gmail.com","5dgder"}
                ,{"budason@gmail.com","7y65f"}};

        return kullaniciBilgileri;
    }

    //Negatif login testi icin verilen 10 adet kullanici adi ve sifreyi deneyip giris yapilamadigini test edin

    @Test
    public void negatifCokluTest(){

        // Mycoursedemy anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        // login linkine basin
        MyCoursedemyPage myCoursedemyPage=new MyCoursedemyPage();
        myCoursedemyPage.loginLinki.click();

        // 1-Verilen listeden  kullanici adi ve password yazalim
        myCoursedemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("myYanlisEmail"));
        myCoursedemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("myGecerliPassword"));

        // Login butonuna basarak login olmaya calisin
        myCoursedemyPage.loginButonu.click();

        // Basarili olarak giris yapilamadigini test edin
        //bunun icin login linkinin görunur oldugunu test edelim
        Assert.assertTrue(myCoursedemyPage.loginLinki.isEnabled());
    }
}
