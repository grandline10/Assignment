package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(features= {"AllFeatureFiles"}, glue= {"stepDefinitions"}, dryRun=false)


public class TestRunner extends AbstractTestNGCucumberTests{

}
