package tests.day19_dataProvider;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_DataProvider {
    @DataProvider
    public static Object[][] AranacakKelimeProvider() {

        Object[][] aranKelimeler={{"Nutella"},{"Java"},{"Apple"},{"Samsung"},{"TV"}};

        return aranKelimeler;
    }

    //Amazon anasayfaya gidin
    //Nutella, Java , Samsung , TV icin arama yapin
    //Arama sonuclarinin aranan kelime icerdigini test edin

    @Test(dataProvider="AranacakKelimeProvider")
    public void aramaTesti(String aranacakKelime){

        //Amazon anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //Nutella, Java , Samsung , TV icin arama yapin
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramakutusu.sendKeys(aranacakKelime + Keys.ENTER);
        //Arama sonuclarinin aranan kelime icerdigini test edin
        String actualSonucYazisi=amazonPage.aramaSonucElementi.getText();
        ReusableMethods.wait(3);
        Assert.assertTrue(actualSonucYazisi.contains(aranacakKelime));


    }
}
