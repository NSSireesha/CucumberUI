package Cucumber.options;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import  io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\FrameworkAPI\\src\\test\\java\\feature\\placevalidation\\placevalidation.feature", glue={"stepdefinition"}, tags="@Deleteplace")
public class Runner {
}
