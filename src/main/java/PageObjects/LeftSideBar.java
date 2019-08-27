package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeftSideBar extends BasePage {

    private WebDriver _driver = null;

    private LeftSideBar(WebDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public static LeftSideBar Initialize(WebDriver driver) {
        return new LeftSideBar(driver);
    }

    //Links
    private By mnu_Food = By.xpath("//a[contains(text(),'Food')]");
    private By lnk_Promos = By.xpath("//a[contains(text(),'Promos')]");
    private By lnk_FanZone = By.xpath("//a[contains(text(),'Fan Zone')]");
    private By lnk_Locations = By.xpath("//a[contains(text(),'Locations')]");
    private By lnk_Wings = By.xpath("//a[contains(text(),'Wings')]");
    private By lnk_Shareables = By.xpath("//a[contains(text(),'Shareables')]");
    private By mnu_Mains = By.linkText("Mains");
    private By lnk_Burgers = By.xpath("//a[contains(text(),'Burgers')]");
    private By lnk_Sandwiches = By.xpath("//a[contains(text(),'Sandwiches')]");
    private By lnk_Wraps = By.xpath("//a[contains(text(),'Wraps')]");
    private By lnk_TendersAndMac = By.xpath("//a[contains(text(),'Tenders & Mac')]");
    private By lnk_Greens = By.xpath("//a[contains(text(),'Greens')]");
    private By lnk_Lunch = By.xpath("//a[contains(text(),'Lunch')]");
    private By lnk_Kids = By.xpath("//a[contains(text(),'Kids')]");
    private By lnk_SidesAndExtras = By.xpath("//a[contains(text(),'Sides & Extras')]");
    private By lnk_Sauces = By.xpath("//a[contains(text(),'Sauces')]");
    private By lnk_Desserts = By.xpath("//a[contains(text(),'Desserts')]");
    private By lnk_Drinks = By.xpath("//a[contains(text(),'Drinks')]");
    private By lnk_Party = By.xpath("//a[contains(text(),'Party')]");



    private By lnk_FullMenu = By.xpath("//a[contains(text(),'Full Menu')]");
    private By lnk_NutritionAndAllergen = By.xpath("//a[contains(text(),'Nutrition & Allergen')]");

    //Actions
    public LeftSideBar mnu_Food_Click() {
        _driver.findElement(mnu_Food).click();
        return this;
    }
    public LeftSideBar lnk_Wings_Click() {
        _driver.findElement(lnk_Wings).click();
        return this;
    }
    public LeftSideBar mnu_Mains_Click() {
        _driver.findElement(mnu_Mains).click();
        return this;
    }
    public LeftSideBar lnk_TendersAndMac_Click() {
        _driver.findElement(lnk_TendersAndMac).click();
        return this;
    }
    public LeftSideBar lnk_SidesAndExtras_Click(){
        _driver.findElement(lnk_SidesAndExtras).click();
        return this;
    }
}

