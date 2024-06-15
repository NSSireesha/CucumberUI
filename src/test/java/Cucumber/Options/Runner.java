package Cucumber.Options;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Learncucumber2\\src\\test\\java\\Feature", glue = "StepDefinition", monochrome = true, tags="@Register or @Login or @Logout")
public class Runner extends AbstractTestNGCucumberTests
{
}

