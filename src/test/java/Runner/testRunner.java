package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/sam/eclipse-workspace/freeCEMBdda/src/test/java/Features/sontacts.feature", glue = {
		"stepDefinition" }
		,dryRun = false
		,monochrome=false
		,strict=false
		
		
		)

public class testRunner {

}
