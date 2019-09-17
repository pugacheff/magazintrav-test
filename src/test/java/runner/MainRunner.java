package runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import org.testng.annotations.AfterClass;
import tests.BaseTest;

import java.io.File;
import java.io.IOException;

@CucumberOptions(
        features = "src/test/java/features"
        ,glue={"steps"}
        ,plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json",
        "com.cucumber.listener.ExtentCucumberFormatter:target/extent-report/report.html" }
        ,monochrome = false
)

public class MainRunner extends BaseTest {
    @AfterClass
    public static void writeExtentReport() throws IOException {
        //Reporter.loadXMLConfig(new File(System.getProperty("user.dir") + "\\src\\main\\java\\utils\\ReportsConfig.xml"));
    }

}
