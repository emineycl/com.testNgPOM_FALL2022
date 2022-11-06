package tests.day15_pageObjectModel;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FaceBookPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C05_PagesKullanimi {
    //1 - https://www.facebook.com/ adresine gidin
    //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
    //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
    //4- Basarili giris yapilamadigini test edin

    @Test
    public void test01(){
        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com");

        //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        Faker faker= new Faker();
        FaceBookPage faceBookPage=new FaceBookPage();
        faceBookPage.cerezler.click();

        faceBookPage.facebookEmailKutusu.sendKeys(faker.internet().emailAddress());
        faceBookPage.facebookPasswordKutusu.sendKeys(faker.internet().password());
        faceBookPage.girisButonu.click();

        //4- Basarili giris yapilamadigini test edin
        Assert.assertTrue(faceBookPage.girilemediYaziElementi.isDisplayed());

        ReusableMethods.wait(5);
    }
}
