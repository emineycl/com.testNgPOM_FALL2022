package tests.day17_smokeTests;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_SingletonPattern {
    /*
    Singleton pattern bir class'dan obje olusturulmasini engelleyen veya sinirlandiran konsepttir.

     */

    @Test
    public void test01(){

        //amazon anasayfaya gidin
       //  Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        /* Tum class'lardan yapabildigimiz gibi Driver class'indan daobje olusturabilir ve oradaki class uyelerini kullanabiliriz
        Boyle bir kullanimda Driver class'indan yaptigimiz tercihler bypass edilmis olur

        Bu tur kullanim onune gecebilmek icin Java'dan singleton pattern konsepti uygulanir

        Driver class'in dan obje olusturulmasini engellemik icin

        Driver class'indan obje olusturup, kullanabilmek icin Driver() constructor'ina ihtiyac vardir
        Eger bu constructor'i erisilemez yaparsak kimse constructor'a erisemez ve dolayisiyla kimse Driver class'indan
        obje olusturamaz

        Bunun icin gorunur parameteresiz bir constructor olusturup bunu private yapariz

        Bu yonteme SINGLETON PATTERN denir.
        */

      //  Driver driver=new Driver();

    }
}
