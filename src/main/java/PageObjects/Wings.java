package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Wings extends BasePage {

    private WebDriver _driver = null;

    private Wings(WebDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public static Wings Initialize(WebDriver driver) {
        return new Wings(driver);
    }

    //Links
    private By lnk_TraditionalOrder = By.xpath("//div[@class='product-grid gw align--top']//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]");
    private By lnk_BonelessOrder = By.xpath("//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]");
    private By lnk_ComboOrder = By.xpath("//div[@id='sub_menu_4fd23227-6bf0-41cb-8b00-5d27d6726527']//div[3]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]");

    //Actions
    public void Lnk_TraditionalOrder_Click() {
        _driver.findElement(lnk_TraditionalOrder).click();
    }

    public void Lnk_BonelessOrder_Click() {
        _driver.findElement(lnk_BonelessOrder).click();
    }
    public void lnk_ComboOrder_Click() {
        _driver.findElement(lnk_ComboOrder).click();
    }
}
