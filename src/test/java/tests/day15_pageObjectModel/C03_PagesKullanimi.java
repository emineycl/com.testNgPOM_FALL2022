package tests.day15_pageObjectModel;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C03_PagesKullanimi {

    /*
    Pages Class'lari bir websayfasinda locate etmek istedigimiz webElementleri locate edip, sonrasinda ihtiyacimiz oldukca
    kullanmak icin olusturulur

    pages class'larinda locate edilen webElemenet'lere erisebilmek icin
    test class'imizda ilgili page class'indan bir obje olustururuz
     */

    @Test
    public void test01(){

        //amazon ana sayfaya gidin
        Driver.getDriver().get("https://www.amazon.com");
        AmazonPage amazonPage=new AmazonPage();

        //Nutella icin arama yapin
        amazonPage.aramakutusu.sendKeys("Nutella" + Keys.ENTER);

        //sonuclarin nutella icerdigini test edin
        String actualSonucYazisi=amazonPage.aramaSonucElementi.getText();
        String expectedKelime="Nutella";

        Assert.assertTrue(actualSonucYazisi.contains(expectedKelime));

        Driver.closeDriver();
    }
}
