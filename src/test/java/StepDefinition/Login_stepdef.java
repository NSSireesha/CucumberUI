package StepDefinition;

import PageObjects.LoginPage;
import Utils.Injectionclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Login_stepdef {

    Injectionclass injection;

public LoginPage loginPage;


    public Login_stepdef ( Injectionclass injection)
    {

        injection= new Injectionclass();
     this.loginPage=  injection.objectManager.getLoginPageobject();

    }

    @Given("User is on LoginPage page")
    public void user_is_on_login_page() {
        Assert.assertEquals(loginPage.loginpagegettitle(), "loginpage");
    }
    @When("user enters {string} and {string}")
    public void user_enters_and(String Username, String Password) {

       loginPage.enterlogindetails(Username,Password);

    }
    @When("clicks on login button")
    public void clicks_on_login_button() {
        loginPage.submitbutnclick();
    }
    @Then("Homepage should appear")
    public void homepage_should_appear() {

        Assert.assertEquals(loginPage.verifyloginmsg(), "login successfull");

    }
}
