package MyTestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "C:\\Programacion\\Prueba\\cucumberTest\\src\\main\\java\\Features", //the path of the feature files
        glue = {"stepDefinitions"},// the path of the step definition files
        format = {"pretty", "html:test-outout"}
)

public class TestRunner {

}
