package testscript;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\FeatureFolder\\Exercise1.feature",
                  "src\\test\\resources\\FeatureFolder\\Exercise2.feature"},
                         plugin="html:target/report.html")
public class RunnerClass {
              
}
