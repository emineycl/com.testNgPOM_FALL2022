package tests.day15_pageObjectModel;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C04_PagesKullanimi {

    //Amazon anasayfaya gidin
    //3 test method'u olusturun
    //Herbir method'da Nutella , Java , Bicycle icin arama yapip,
    // sonuclarin arama yaptigimiz kelimeleri icerdigini test edin.
    AmazonPage amazonPage=new AmazonPage();

    @Test(dependsOnMethods = "bicycleTesti")
    public void nutellaTesti(){
        amazonPage.aramakutusu.clear();
        amazonPage.aramakutusu.sendKeys("nutella"+Keys.ENTER);
        String actualAramaSonucu=amazonPage.aramaSonucElementi.getText();
        String expectedKelime="nutella";
        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));

        ReusableMethods.bekle(3);
        Driver.closeDriver();
    }
    @Test(dependsOnMethods = "bicycleTesti")
    public void javaTesti(){
        amazonPage.aramakutusu.clear();
        amazonPage.aramakutusu.sendKeys("java"+Keys.ENTER);
        String actualAramaSonucu=amazonPage.aramaSonucElementi.getText();
        String expectedKelime="java";
        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));

    }
    @Test
    public void bicycleTesti(){
        Driver.getDriver().get("https://www.amazon.com");
        amazonPage.aramakutusu.sendKeys("bicycle"+ Keys.ENTER);
        String actualAramaSonucu=amazonPage.aramaSonucElementi.getText();
        String expectedKelime="bicycle";
        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));
    }
}
