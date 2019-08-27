package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemAddedPage extends BasePage {

    private WebDriver _driver = null;

    private ItemAddedPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
    }
    public static ItemAddedPage Initialize(WebDriver driver) {
        return new ItemAddedPage(driver);
    }
    //Links
    private By btn_ViewOrder = By.xpath("//button[contains(text(),'View Order')]");
    private By lnk_AddAnotherItem = By.xpath("//a[@class='h5 anchor--underline']");

    //Actions
    public void lnk_AddAnotherItem_Click() {
        _driver.findElement(lnk_AddAnotherItem).click();
    }
    public void btn_ViewOrder_Click() {
        _driver.findElement(btn_ViewOrder).click();
    }
}
