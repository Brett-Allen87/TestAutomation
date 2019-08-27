package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyBDubs extends BasePage {
    private WebDriver _driver = null;

    private MyBDubs(WebDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public static MyBDubs Initialize(WebDriver driver) {
        return new MyBDubs(driver);
    }

    //Links
    private By btn_Orders = By.xpath("//button[contains(text(),'Orders')]");
    private By btn_Favorites = By.xpath("//button[contains(text(),'Favorites')]");
    private By btn_Account = By.xpath("//button[contains(text(),'Account')]");
}
