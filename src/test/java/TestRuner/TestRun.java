package TestRuner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={".//features/LoginDTS.feature"}, glue="Stepdefination")
public class TestRun {

}
