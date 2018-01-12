package org.sgcib.itec.fcc.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "org.sgcib.itec.fcc.cucumber")
public class CucumberTest {
}
