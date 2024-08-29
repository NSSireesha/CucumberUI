package Resources;


import Pojo.addplace;
import Pojo.location;

import java.util.ArrayList;
import java.util.List;

public class Databuild {

public addplace getaddplacebody(String name, String address, String phone) {


    location loc = new location();
    loc.setLat("-38.393494");
    loc.setLng("33.421362");

    addplace ap = new addplace();

    ap.setAccuracy("50");
    ap.setPhone_number(phone);
    ap.setName(name);
    ap.setLanguage("French-IN");
    ap.setWebsite("http://google.com");
    ap.setAddress(address);
    List<String> t = new ArrayList<>();

    t.add("shoe park");
    t.add("shop");

    ap.setTypes(t);
    ap.setLocation(loc);

    return ap;
}


public String deleteapibody(String place_id)
{

    return "{\n" +
            "    \"place_id\":\""+place_id+"\"\n" +
            "}";
}
}
