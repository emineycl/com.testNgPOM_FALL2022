package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FaceBookPage {

    public FaceBookPage(){
        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy(xpath = "//button[@value='1'])[3]")
    public WebElement cerezler;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement facebookEmailKutusu;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement facebookPasswordKutusu;

    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement girisButonu;
    @FindBy(xpath = "//button[@name=‘login’]")
    public WebElement girilemediYaziElementi;


}
