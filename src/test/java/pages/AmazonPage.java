package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // amazondaki arama kutusu locate edelim

    @FindBy(id="twotabsearchtextbox")
        public WebElement aramakutusu;

    @FindBy(xpath = "//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]")
    public WebElement aramaSonucElementi;
}
