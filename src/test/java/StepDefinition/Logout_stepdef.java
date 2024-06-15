package StepDefinition;

import PageObjects.LogoutPage;
import Utils.Injectionclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Logout_stepdef {
    Injectionclass injection;
    LogoutPage logoutPage;
    public Logout_stepdef (Injectionclass injection)
    {
        this.injection= injection;
       this.logoutPage= injection.objectManager.getLogoutPageobject();

    }

    @Given("User is successfully logged in")
    public void user_is_successfully_logged_in() {


Assert.assertEquals(logoutPage.logoutpagetitle(), "logoutpagetitle");


    }
    @When("user clicks on signout button")
    public void user_clicks_on_signout_button() {

        logoutPage.clicksignoutbtn();

    }
    @Then("Successful logout message should be displayed")
    public void successful_logout_message_should_be_displayed() {

       Assert.assertEquals( logoutPage.getlogoutmsg(), "loggedout successfully");
    }
}
