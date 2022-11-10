package tests.smokeTests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MyCoursedemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class NegatifLoginTesti {
    // Mycoursedemy anasayfasina gidin
// login linkine basin
// uc farkli test method'u ile yanlis bilgilerle giris yapilamadigini test edin
// 1- yanlis kullanici adi, gecerli password
// 2- gecerli kullanici adi, yanlis password
// 3- yanlis kullanici adi, yanlis password
// Login butonuna basarak login olmaya calisin
// Basarili olarak giris yapilamadigini test edin
    MyCoursedemyPage myCoursedemyPage=new MyCoursedemyPage();
    @BeforeClass
    public void setUp(){
   // Mycoursedemy anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
    // login linkine basin
        myCoursedemyPage.loginlinki.click();
    }

    // uc farkli test method'u ile yanlis bilgilerle giris yapilamadigini test edin
    @Test
    public void yanlisKullaniciTesti(){
        // 1- yanlis kullanici adi, gecerli password
        myCoursedemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("myYanlisEmail"));
        myCoursedemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("myGecerliPassword"));

        // Login butonuna basarak login olmaya calisin
        myCoursedemyPage.loginButonu.click();

        // Basarili olarak giris yapilamadigini test edin
        //bunun icin login linkinin görunur oldugunu test edelim
        Assert.assertTrue(myCoursedemyPage.loginlinki.isEnabled());
    }
    @Test
    public void yanlisPasswordTesti(){
        // 2- gecerli kullanici adi, yanlis password
        myCoursedemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("myGecerliEmail"));
        myCoursedemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("myYanlisPassword"));

        // Login butonuna basarak login olmaya calisin
        myCoursedemyPage.loginButonu.click();

        // Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(myCoursedemyPage.loginlinki.isEnabled());

    }
    @Test
    public void yanlisEmailSifreTesti(){
        // 3- yanlis kullanici adi, yanlis password
        myCoursedemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("myYanlisEmail"));
        myCoursedemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("myYanlisPassword"));

        // Login butonuna basarak login olmaya calisin
        myCoursedemyPage.loginButonu.click();

        // Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(myCoursedemyPage.loginlinki.isEnabled());
}


    @AfterClass
    public void  tearrDown(){
        ReusableMethods.wait(5);
        Driver.closeDriver();
    }

}
