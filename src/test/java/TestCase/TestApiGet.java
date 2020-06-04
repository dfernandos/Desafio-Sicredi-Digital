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

    //valida se o status code da requisição é 200
    //Imprime o retorno da requisição
    @Test
    public void validateStatusCode(){
        response.
                then().statusCode(200);
        response.body().prettyPrint();
    }

    //Valida se o Id do Json body é 1
    @Test
    public void validateIdReturn(){
        response.then().body("id", Matchers.is(1));
    }

    //Validade se o campo meses do Json body corresponde a "112", "124", "136", "148"
    @Test
    public void validateMonthsReturn(){
        response.then().body("meses", Matchers.equalTo(Arrays.asList("112", "124", "136", "148")));
    }

    //Valida de o campo valor do Json Body corresponde a "2.802", "3.174", "3.564", "3.971"
    @Test
    public void validateAmontReturn(){
        response.then().body("valor", Matchers.equalTo(Arrays.asList("2.802", "3.174", "3.564", "3.971")));
    }
}
