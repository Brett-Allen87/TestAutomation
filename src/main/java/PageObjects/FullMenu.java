package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FullMenu extends BasePage {

    private WebDriver _driver = null;

    private FullMenu(WebDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public static FullMenu Initialize(WebDriver driver) {
        return new FullMenu(driver);
    }

    //Links
    private By lnk_Wings = By.xpath("//h2[contains(text(),'Wings')]");
    private By lnk_TendersAndMac = By.xpath("//h2[contains(text(),'Tenders & Mac')]");

    //Actions
    public void lnk_Wings_Click() {
        _driver.findElement(lnk_Wings).click();
    }

    public void lnk_TendersAndMac() {
        _driver.findElement(lnk_TendersAndMac).click();
    }
}
