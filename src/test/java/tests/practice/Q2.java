package tests.practice;

import org.testng.annotations.Test;
import utilities.TestBase;
import utilities.TestBaseClass;

public class Q2 extends TestBaseClass {
/*
    - Birbirine bagimli testler olusturun.
    - beforeClass olusturup setUp ayarlarini yapin.
    - Birbirine bagimli testler olusturarak ;
        =>ilk once facebook'a gidin
        =>sonra facebook'a bagimli olarak google'a gidin
        =>daha sonra google'a bagimli olarak amazon'a gidin
    -driver'i kapatin.
     */

    @Test (dependsOnMethods = "facebook")
    public void google(){
    driver.get("https://www.google.com");
}
    @Test
    public void facebook(){
    driver.get("https://www.facebook.com");
    }

    @Test (dependsOnMethods = "google")
    public void amazon(){
        driver.get("https://www.amazon.com");

    }
}
