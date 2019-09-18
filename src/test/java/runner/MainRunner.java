package runner;

import cucumber.api.CucumberOptions;
import tests.BaseTest;
import java.io.IOException;

@CucumberOptions(
        features = "src/test/java/features"
        ,glue={"steps"}
        }
        ,monochrome = false
)

public class MainRunner extends BaseTest {

}
