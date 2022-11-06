package tests.day16_pageObjectModel;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_ConfigReaderKullanimi {

    @Test
    public void method(){
    //Amazon anasayfaya gidin
       // driver.get("https://www.amazon.com");
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    //1 test method'u olusturun

    //Nutella icin arama yapip,
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramakutusu.sendKeys(ConfigReader.getProperty("amazonAramaKelimesi"));
    // sonuclarin arama yaptigimiz kelimeyi icerdigini test edin.

        String expectedKelime=ConfigReader.getProperty("amazonAramaKelimesi");
        String actualAramaSonucu=amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));
    ReusableMethods.wait(5);
    Driver.closeDriver();
}
}