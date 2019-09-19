package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import tests.BaseTest;
import utils.Helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

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
    }

    private String getDate() {
        return DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss").format(ZonedDateTime.now());
    }

}
