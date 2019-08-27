package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PageObjects.EnvironmentVariables;


public class Login extends BasePage {

    private WebDriver _driver = null;

    private Login(WebDriver driver) {
        super(driver);
        this._driver = driver;
    }
    public static Login Initialize(WebDriver driver) {
        return new Login(driver);
    }

    //Elements
    private By txt_Email = By.cssSelector("#email");
    private By txt_Password = By.cssSelector("#password");
    private By btn_SignIn = By.cssSelector("#signInButton");

    //Actions
    public void fn_Login(){
        _driver.findElement(txt_Email).sendKeys(EnvironmentVariables.userBrett);
        _driver.findElement(txt_Password).sendKeys(EnvironmentVariables.passBrett);
        _driver.findElement(btn_SignIn).click();
    }





}
