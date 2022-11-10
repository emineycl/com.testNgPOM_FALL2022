package tests.smokeTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyCoursedemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class EndToEndTesti {

  // MyCoursedemy sayfasina gidin
  // gecerli kullanici adi ve sifre girerek sisteme login olun
  // Instructor linkini tiklayin
  // yeni bir course olusturmak icin istenen bilgileri girin
  // yeni kursun olusturuldugunu test edin

  /*
  E2E (End to end testi, uctan uca bir islevin tum asamalarini
  gerceklestirerek, islevin calistigini test etmek demektir

  Bir uygulamada bircok e2e testi olabilir
 */

    @Test
    public void e2eKursOlusturmaTesti(){
        // MyCoursedemy sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        // gecerli kullanici adi ve sifre girerek sisteme login olun
        MyCoursedemyPage myCoursedemyPage=new MyCoursedemyPage();
        myCoursedemyPage.loginMethodu();

        // Instructor linkini tiklayin
        myCoursedemyPage.instructorLinki.click();    /* Bu arada hata veriyor */

        // course manager linkine tiklayin
        myCoursedemyPage.courseManagerLinki.click();

        //add New course butonuna tiklayin
        myCoursedemyPage.addNewCourseButonu.click();

        //course title bilgisini girin
        myCoursedemyPage.courseTitleKutusu.sendKeys(ConfigReader.getProperty("myCourseTitle"));

        //cotegory menusune tiklayin
        myCoursedemyPage.categoryMenusu.click();

        //ilgili kurs kategorisini secin
        myCoursedemyPage.categorySecimi.click();

        //next butonuna basalim
        myCoursedemyPage.ilkNextButonu.click();

        //next butonuna basalim
        myCoursedemyPage.ilkNextButonu.click();

        //price kutusuna fiyati yazdiralim
        myCoursedemyPage.discountKutusu.sendKeys(ConfigReader.getProperty("myCoursePrice"));

        //indirim kutusuna %50 yzazalim
        myCoursedemyPage.coursePrice.sendKeys(ConfigReader.getProperty("myDiscount"));

        //next butonuna basalim
        myCoursedemyPage.ilkNextButonu.click();

        //next butonuna basalim
        myCoursedemyPage.ilkNextButonu.click();

        //meta keywords kutusuna java kursu yazdiralim
        myCoursedemyPage.metaKeywordsKutusu.sendKeys(ConfigReader.getProperty("myMetaKeywords"));

        //next butonuna basalim
        myCoursedemyPage.ilkNextButonu.click();

        //submit butonuna basalim
        myCoursedemyPage.submitButonu.click();

        // yeni kursun olusturuldugunu test edin
        Assert.assertTrue(myCoursedemyPage.backToCourseListButonu.isEnabled());

        Driver.closeDriver();

    }
}
