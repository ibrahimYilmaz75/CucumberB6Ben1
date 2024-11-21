package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@RegressionTest or @SmokeTest",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}

)
public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
    // group(tags) da or var ise : Herhangi birisi olan çağrılır
    // group(tags) da and var ise : Her iki grup adı olanlar çağrılır
}
