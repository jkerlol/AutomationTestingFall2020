import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/modollas/Documents/GitHub/AutomationTestingFall2020/Selenium1/src/Features", glue = {"stepDefinitions"},
plugin = {"pretty", "junit:target/JUnitReports/report.json"})
public class TestRunner1 {

}
