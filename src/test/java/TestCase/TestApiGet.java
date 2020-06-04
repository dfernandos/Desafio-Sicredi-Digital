package TestCase;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class TestApiGet {

    private static final String ENDPOINT = "http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador";
    private Response response;

    @Before
    public void before(){
        response = RestAssured.given().when().get(ENDPOINT);
    }

    @Test
    public void validateStatusCode(){
        response.
                then().statusCode(200);
        response.body().prettyPrint();
    }
    
    @Test
    public void validateIdReturn(){
        response.then().body("id", Matchers.is(1));
    }

}
