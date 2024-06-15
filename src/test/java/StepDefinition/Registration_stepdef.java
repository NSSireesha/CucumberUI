package StepDefinition;

import PageObjects.RegistrationPage;
import Utils.Injectionclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.sql.SQLOutput;

public class Registration_stepdef {

    Injectionclass injection;
    RegistrationPage registrationPage;
    public Registration_stepdef(Injectionclass injection)
    {
        this.injection= injection;

       this.registrationPage= injection.objectManager.getRegistrationpageobj();

    }

    @Given("user is on registration page")
    public void user_is_on_registration_page() {

        Assert.assertEquals(registrationPage.getregistrationtitle(), "regsitration page");

    }
    @When("{string}, {string} and {string} are entered")
    public void and_are_entered(String Username, String Password, String Email) {


        registrationPage.setregistrationdetails(Username,Password, Email);
    }
    @When("submit button is clicked")
    public void submit_button_is_clicked() {

        registrationPage.clicksubmitbtn();

    }
    @Then("RegistrationPage success message should be shown")
    public void registration_success_message_should_be_shown() {
Assert.assertEquals(registrationPage.getsuccessmsg(), "registration successful");
    }
}
