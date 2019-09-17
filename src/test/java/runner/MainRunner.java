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
        ,plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json"}
        ,monochrome = false
)

public class MainRunner extends BaseTest {



}
