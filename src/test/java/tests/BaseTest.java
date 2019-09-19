package tests;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends AbstractTestNGCucumberTests {

    public static WebDriver driver;
    public static WebDriverWait driverWait;

    public static WebDriver startDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driverWait = new WebDriverWait(driver, 4);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        return driver;
    }

    public static void quitDriver() {
        driver.quit();
    }
}
