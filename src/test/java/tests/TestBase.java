package tests;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase extends AbstractTestNGCucumberTests {

    public static WebDriver driver ;

    @BeforeSuite
    public void startDriver() {

    }

    @AfterSuite
    public void finishDriver() {

    }

}
