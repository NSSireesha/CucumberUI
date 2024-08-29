package stepdefinition;


import Resources.Databuild;
import Resources.Resources;
import Utils.RequestSpecutility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.runner.Request;

import java.io.FileNotFoundException;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class stepdefinition extends RequestSpecutility {

    RequestSpecification req;
    Response resp;
    Databuild db= new Databuild();

     static String place_id;

    @Given("ADDPlace paylod with {string} {string} {string}")
    public void add_place_paylod_with(String name, String address, String phone) throws FileNotFoundException {

      req= given().spec(getreqspecification())
                .body(db.getaddplacebody(name, address, phone));
    }
    @When("{string} payload is called using {string} method")
    public void payload_is_called_using_method(String path, String method) {
        Resources resourc=Resources.valueOf(path);



if (method.equalsIgnoreCase("POST")) {
    resp = req.when().post(resourc.getresource());
}
        else if (method.equalsIgnoreCase("GET"))
{
    resp = req.when().get(resourc.getresource());
}


    }
    @Then("statuscode should be {int}")
    public void statuscode_should_be(Integer int1) {

        System.out.println(resp.getStatusCode());
       assertEquals(200, resp.getStatusCode());
    }
    @Then("{string} is {string}")
    public void is(String key, String value) {

         resp= resp.then().extract().response();
        System.out.println(getresponse(resp, key));
       assertEquals(value,  getresponse(resp,key));


    }

    @Then("verify if the address generated when {string} APi is called matches {string}")
    public void verify_if_the_address_generated_when_a_pi_is_called_matches(String path, String address) throws FileNotFoundException {


         place_id = getresponse(resp, "place_id");
        System.out.println(place_id);
        req = given().log().all().spec(getreqspecification()).queryParam("place_id", place_id);
        payload_is_called_using_method(path, "GET");

        assertEquals(address, getresponse(resp, "address"));
    }

        @Given("DeletePlace payload")
        public void delete_place_payload() throws FileNotFoundException {

       req= given().spec(getreqspecification())
               .body(db.deleteapibody(place_id));

        }




    }




