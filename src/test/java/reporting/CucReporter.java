package reporting;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import net.masterthought.cucumber.json.support.Status;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CucReporter {

    public static void Report() {
        File reportOutputDirectory = new File("target/cucumber-reporter");
        List<String> jsonFiles = new ArrayList<>();

        File cucumberJson = new File("target/cucumber.json");
        String absoluteCucumJson = cucumberJson.getAbsolutePath().replace("/", "\\\\");

        jsonFiles.add(absoluteCucumJson);
        String buildNumber = "1";
        String projectName = "cucumberProject";

        Configuration configuration = new Configuration(reportOutputDirectory, projectName);

        // do not make scenario failed when step has status SKIPPED
        configuration.setNotFailingStatuses(Collections.singleton(Status.SKIPPED));
        configuration.setBuildNumber(buildNumber);

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        Reportable result = reportBuilder.generateReports();
        // and here validate 'result' to decide what to do if report has failed
    }
}
