package MyTestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "src\\main\\java\\Features", //the path of the feature files
        glue = {"stepDefinitions"}// the path of the step definition files
//        monochrome = true
)

public class TestRunner {

}
