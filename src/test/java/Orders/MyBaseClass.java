package Orders;

import PageObjects.EnvironmentVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class MyBaseClass {


    protected WebDriver driver = null;


    @BeforeTest
    public void beforeEachTest()
    {

        System.setProperty("webdriver.chrome.driver", EnvironmentVariables.exePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get(EnvironmentVariables.URL);
    }

//    @AfterTest
//    public void afterEachTest() throws InterruptedException
//    {
//        Thread.sleep(5000);
//        driver.quit();
//    }


}
