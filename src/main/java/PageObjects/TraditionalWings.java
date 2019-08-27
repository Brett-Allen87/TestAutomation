package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TraditionalWings extends BasePage {

    private WebDriver _driver = null;

    private TraditionalWings(WebDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public static TraditionalWings Initialize(WebDriver driver) {
        return new TraditionalWings(driver);
    }

    //Links
    private By btn_AddToOrder = By.xpath("//button[@class='btn btn--full']");

    private By rdb_TradSnack = By.xpath("//button[@id='3790']");
    private By rdb_TradSmall = By.xpath("//button[@id='3791']");
    private By rdb_TradMedium = By.xpath("//button[@id='3792']");
    private By rdb_TradLarge = By.xpath("//button[@id='3793']");

    private By rdb_SpicyGarlic = By.xpath("//h3[contains(text(),'Spicy Garlic')]");
    private By rdb_Blazin = By.xpath("//h3[contains(text(),\"Blazin'®\")]");
    private By rdb_BuffaloHot = By.xpath("//button[@id='23895']//div[@class='sauce-or-seasoning wild']");
    private By rdb_HotBBQ = By.xpath("//button[@id='23897']//div[@class='sauce-or-seasoning wild']");
    private By rdb_BuffaloMedium = By.xpath("//button[@id='23901']//div[@class='sauce-or-seasoning medium']");

    private By rdb_RanchAdd = By.xpath("//li[2]//div[1]//div[1]//div[2]//div[1]//button[2]");
    private By rdb_CeleryAdd = By.xpath("//li[3]//div[1]//div[1]//div[2]//div[1]//button[2]");

    //Actions
    public TraditionalWings rdb_TradMedium_Click() {
        _driver.findElement(rdb_TradMedium).click();
        return this;
    }
    public TraditionalWings rdb_SpicyGarlic_Click() {
        _driver.findElement(rdb_SpicyGarlic).click();
        return this;
    }
    public TraditionalWings rdb_RanchAdd_Click() {
        _driver.findElement(rdb_RanchAdd).click();
        return this;
    }
    public TraditionalWings rdb_CeleryAdd_Click() {
        _driver.findElement(rdb_CeleryAdd).click();
        return this;
    }
    public void btn_AddToOrder_Click() {
        _driver.findElement(btn_AddToOrder).click();
    }

    //Functions
    public void fn_MedSpicyGarlicWithRanchAndCel() {
        rdb_TradMedium_Click();
        rdb_SpicyGarlic_Click();
        rdb_RanchAdd_Click();
        rdb_CeleryAdd_Click();
        btn_AddToOrder_Click();

    }
    public void fn_SmallBlazinWithRanchAndCel() {
        _driver.findElement(rdb_TradSmall).click();
        _driver.findElement(rdb_Blazin).click();
        rdb_RanchAdd_Click();
        rdb_CeleryAdd_Click();
        btn_AddToOrder_Click();
    }
}
