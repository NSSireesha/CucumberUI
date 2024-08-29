package Utils;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class RequestSpecutility {
    public static RequestSpecification req;
    JsonPath js;

public RequestSpecification getreqspecification() throws FileNotFoundException {




    if (req == null) {
        PrintStream log = new PrintStream(new FileOutputStream("log.txt"));
        req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
                .addFilter(RequestLoggingFilter.logRequestTo(log))
                .addFilter(ResponseLoggingFilter.logResponseTo(log))
                .addQueryParam("key", "qaclick123")
                .setContentType(ContentType.JSON).build();

        return req;
    }
    return req;

}

public String getresponse(Response resp, String key)
{
     js= new JsonPath(resp.asString());

  return  js.getString(key);
}

}