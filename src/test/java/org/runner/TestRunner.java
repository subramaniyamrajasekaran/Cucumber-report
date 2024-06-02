package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.step.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.step",dryRun=false,
plugin= {"html:target","junit:JUNIT\\junitreport.xml","json:JSON\\jsonreport.json"})
public class TestRunner {
	@AfterClass
	public static void report() {
		JvmReport.reportJvm("C:\\Users\\Bharathi\\eclipse-workspace\\CucumberProject\\JSON");

	}
}
