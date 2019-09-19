package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import reporting.CucReporter;
import tests.BaseTest;
import utils.Helper;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class MasterHooks extends BaseTest {

    @Before
    public void setup() {
        driver = BaseTest.startDriver();
    }

    @After
    public void tearDown(Scenario scenario) throws InterruptedException {
        try {
            if (driver != null && scenario.isFailed()) {
                Helper.captureScreenshot(driver, scenario.getName() + " " + getDate());
                driver.manage().deleteAllCookies();
                driver.quit();
            }
            if(driver != null) {
                driver.manage().deleteAllCookies();
                driver.quit();
            }
        } catch(Exception e) {
            System.out.println("tearDown" + e.getMessage());
        }
        CucReporter.Report();
    }

    private String getDate() {
        return DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss").format(ZonedDateTime.now());
    }

}
