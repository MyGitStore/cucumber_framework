package com.training.Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"C:\\Users\\hellojuly\\eclipse-workspace\\cucumber_framework_main\\features"},
		glue= {"com.training.Steps"},
		//tags= "@All",
		plugin= {"pretty", "html:target/cucumber-reports/cucumber.html",
				 "json:target/cucumber-reports/cucumber.json"}
				// publish=true
				//jenkins
		)

public class Runner {
	

}
