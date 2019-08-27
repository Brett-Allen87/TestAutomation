package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CrispyTenders extends BasePage {

    private WebDriver _driver = null;

    private CrispyTenders(WebDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public static CrispyTenders Initialize(WebDriver driver) {
        return new CrispyTenders(driver);
    }

    //Links
    private By btn_AddToOrder = By.xpath("//button[@class='btn btn--full']");

    private By rdb_FourTenders = By.xpath("//span[contains(text(),'4 Chicken Tenders')]");
    private By rdb_SixTenders = By.xpath("//span[contains(text(),'6 Chicken Tenders')]");

    private By rdb_BuffaloMedium = By.xpath("//h3[contains(text(),'Buffalo Medium')]");

    public CrispyTenders rdb_FourTenders_Click(){
        _driver.findElement(rdb_FourTenders).click();
        return this;
    }
    public CrispyTenders rdb_SixTenders_Click(){
        _driver.findElement(rdb_SixTenders).click();
        return this;
    }
    public CrispyTenders rdb_BuffaloMedium_Click(){
        _driver.findElement(rdb_BuffaloMedium).click();
        return this;
    }
    public void fn_FourTendersWithMedium() {
        rdb_FourTenders_Click();
        rdb_BuffaloMedium_Click();
        _driver.findElement(btn_AddToOrder).click();
    }
}
