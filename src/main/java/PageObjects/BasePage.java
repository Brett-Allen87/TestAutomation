package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage
{
    protected WebDriver _driver = null;
    protected WebDriverWait wait = null;


    public BasePage(WebDriver driver)
    {
        this._driver = driver;
        WaitForPageLoadToComplete();
       // WaitForAjax();
    }

    public void StopPageLoad()
    {
        JavascriptExecutor js = (JavascriptExecutor)_driver;
        js.executeScript("return window.stop");
    }

    public WebElement ExpandRootElement(WebElement element)
    {
        WebElement ele = (WebElement)((JavascriptExecutor)_driver)
                .executeScript("return arguments[0].shadowRoot", element);
        return ele;
    }
    public WebElement GetFirstChild(WebElement element)
    {
        WebElement ele = (WebElement)((JavascriptExecutor)_driver)
                .executeScript("return arguments[0].firstChild", element);
        return ele;
    }


    private void ExecuteJavascript(String javascript)
    {
        JavascriptExecutor js = (JavascriptExecutor)_driver;
        js.executeScript(javascript);
    }


    public void SetAttributeOfElement(WebElement el, String attribute, String input)
    {
        JavascriptExecutor executor = (JavascriptExecutor)_driver;
        String script = "document.getElementById(\"" + el.getAttribute("id") + "\").setAttribute(\""+ attribute + "\", \""+ input + "\");";
        executor.executeScript(script);
    }

    public void ClickCheckBox(boolean desiredState, By chk_Identifier)
    {
        WebElement cb = _driver.findElement(chk_Identifier);
        if (desiredState != cb.isSelected())
            cb.click();
    }

    public void WaitForPageLoadToComplete(int intTimeOutFromSeconds) throws InterruptedException
    {
        int counter = 0;
        while(((JavascriptExecutor)_driver).executeScript("return document.readyState") != ("complete")
                && counter++ < intTimeOutFromSeconds);
        {
            Thread.sleep(1000);
        }
    }
    public void WaitForPageLoadToComplete()
    {
        WebDriverWait wait = new WebDriverWait(_driver, 30);
        wait.until(d -> ((JavascriptExecutor)_driver).executeScript("return document.readyState").equals("complete"));
    }

    public void WaitForAjax()
    {
        JavascriptExecutor executor = (JavascriptExecutor)_driver;
        if ((Boolean)executor.executeScript("return window.jQuery != undefined"))
        {
            while (!(Boolean)executor.executeScript("return jQuery.active == 0"))
            {

            }
        }
    }

    public void WaitForStale(WebElement element, int TimeOutInSeconds)
    {
        wait = new WebDriverWait(this._driver, TimeOutInSeconds);
        wait.until(ExpectedConditions.stalenessOf(element));
        System.out.println("element has become stale!!!");
    }

}