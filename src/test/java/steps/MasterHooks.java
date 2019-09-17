package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import tests.BaseTest;
import utils.Helper;

public class MasterHooks extends BaseTest {

    @Before
    public void setup() {
        driver = BaseTest.startDriver();
    }

    @After
    public void tearDown(Scenario scenario) throws InterruptedException {
        try{
            if (driver != null && scenario.isFailed()){
                Helper.captureScreenshot(driver, scenario.getId() + scenario.getName());
                driver.manage().deleteAllCookies();
                driver.quit();
            }
            if(driver != null){
                driver.manage().deleteAllCookies();
                driver.quit();
            }
        }catch(Exception e){
            System.out.println("tearDown" + e.getMessage());
        }
    }

}
