package tests.smokeTests;

import org.testng.Assert;
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
        myCoursedemyPage.loginLinki.click();

        //Kullanici email'i olarak valid email girin
        myCoursedemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("myGecerliEmail"));

        //Kullanici sifresi olarak valid sifre girin
        myCoursedemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("myGecerliPassword"));

        //Login butonuna basarak login olun
        myCoursedemyPage.loginButonu.click();

        //Basarili olarak giris yapildiginni test edin
        Assert.assertTrue(myCoursedemyPage.coursesLinki.isDisplayed());

    }
}
  /*
     US_011 my_wishlist page functions should work correctly

    -When the compare link is clicked, it should redirect to the Course compare page
    -Course should be able to get selected from the search box
    -When the course name is clicked, it should redirect to the page of the relevant course.
    -When the instructor icon is clicked, it should redirect to the relevant instructor page.
    -The course should be able to verify the number
    and duration of the course on the relevant page when the course name is clicked.
    */
 /*
    US_012 Course compare page functions should work correctly

    -Courses should be searchable from dropboxes
    -When the learn more link is clicked, it should redirect to the page of the relevant course
    -When the buy now button is clicked, it should redirect to the shopping_cart page
     */

/*
    US_014 The functions of the purchase_history page should work correctly

    -When the invoice button is clicked, it should redirect to the invoice page.
    -When the course name is clicked, it should redirect to the page of the relevant course.
    */