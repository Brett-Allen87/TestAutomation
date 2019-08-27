package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SidesAndExtras extends BasePage {
    private WebDriver _driver = null;

    private SidesAndExtras(WebDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public static SidesAndExtras Initialize(WebDriver driver) {
        return new SidesAndExtras(driver);
    }

    //Links
    private By btn_AddRanch = By.xpath("//div[@id='sub_menu_extras_9864da74-9c30-4d4c-bf10-111d8ec68fce']//div[9]//div[1]//div[1]//div[1]//div[1]//div[1]//button[1]");

    //Actions
    public void btn_AddRanch_Click(){
        _driver.findElement(btn_AddRanch).click();
    }

}
