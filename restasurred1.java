import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restasurred1 {

public static void main (String srg[]) {

    RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";

    RequestSpecification hreq = RestAssured.given();

    Response res = hreq.request(Method.GET,"/Hyderabad");

    System.out.println("Response is "+ res.getBody().asString());
}
}
