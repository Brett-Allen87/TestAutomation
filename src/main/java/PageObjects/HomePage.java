package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PageObjects.BasePage;


public class HomePage extends BasePage {

    private WebDriver _driver = null;

    private HomePage(WebDriver driver) {
        super(driver);
        this._driver = driver;
    }
    public static HomePage Initialize(WebDriver driver) {
        return new HomePage(driver);
    }

    //Links
    private By lnk_Login = By.xpath("//div[@class='login']//a");
    private By lnk_SetOrderLocation = By.xpath("//div[@class='h2 text-center']");



    //Actions

    public void lnk_Login_Click(){
        _driver.findElement(lnk_Login).click();
    }
    public void lnk_SetOrderLocation_Click() {
        _driver.findElement(lnk_SetOrderLocation).click();
    }
}
