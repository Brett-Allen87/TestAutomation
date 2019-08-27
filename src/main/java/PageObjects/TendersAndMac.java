package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TendersAndMac extends BasePage {

    private WebDriver _driver = null;

    private TendersAndMac(WebDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public static TendersAndMac Initialize(WebDriver driver) {
        return new TendersAndMac(driver);
    }

    //Links
    private By lnk_CrispyTendersOrder = By.xpath("//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]");


    //Actions
    public void lnk_CrispyTendersOrder_Click() {
        _driver.findElement(lnk_CrispyTendersOrder).click();
    }
}
