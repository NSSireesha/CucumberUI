package stepdefinition;


import io.cucumber.java.Before;
import stepdefinition.stepdefinition;

import java.io.FileNotFoundException;

public class Hooks {


    @Before("@Deleteplace")

    public void beforemethod() throws FileNotFoundException {


        stepdefinition sd = new stepdefinition();

        if (stepdefinition.place_id == null) {

            sd.add_place_paylod_with("House2", "addr1", "12121435");
            sd.payload_is_called_using_method("ADDPlace", "post");
            sd.verify_if_the_address_generated_when_a_pi_is_called_matches("GETPlace", "addr1");
            System.out.println(stepdefinition.place_id);
        }

    }
}

