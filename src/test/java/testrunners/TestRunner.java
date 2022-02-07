package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.core.plugin.TestNGFormatter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/com/features/LoginTest.feature", glue = { "stepDefinitions" }, dryRun = false, monochrome = true //, tags = { "@SecondTag" }
// , plugin =
// {"html:target/cucumber-html-report","json:target/cucumber.json","pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json","junit:target/cucumber-results.xml"}
// Tags that are comma-separated are ORed.
// EXAMPLE ,tags ={"FirstTag, @SecondTag"}

// Tags which are passed in separate quotes are ANDed
// EXAMPLE ,tags ={"FirstTag", "@SecondTag"} //tags passed in seperate quotes

// Execute all tests of the feature tagged as @FunctionalTests but skip
// scenarios tagged as @SmokeTest
// EXAMPLE ,tags ={"@FucntionalTests","~@SmokeTests"}

// Execute all tests which are not at all tagged in all the Features
// EXAMPLE ,tags ={"`~@FucntionalTests","~@SmokeTests","~@RegressionTests"}

// ,format = {"Pretty"}
// ,format = {"pretty","html:test-output","json:src/cucumber.json", "junit:junit_xml/cucumber.xml"}
)

public class TestRunner {
	

	/*
	 * GHERKIN KEYWORDS Feature Background Scenario Given When Then And But
	 **/

}
