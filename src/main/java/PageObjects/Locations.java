package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locations extends BasePage {

    private WebDriver _driver = null;

    private Locations(WebDriver driver) {
        super(driver);
        this._driver = driver;
    }
    public static Locations Initialize(WebDriver driver) {
        return new Locations(driver);
    }

    //Links
    private By btn_Nearby = By.xpath("//button[@class='location-search-btn btn hidden-below-desk']");
    private By btn_OrderPickup = By.xpath("//div[@class='location-card-container__scroll']//div[1]//div[1]//div[2]//div[1]//div[1]//button[1]");

    //Actions
    public void fn_setLocation()  {
        _driver.findElement(btn_Nearby).click();
        _driver.findElement(btn_OrderPickup).click();

    }
}
