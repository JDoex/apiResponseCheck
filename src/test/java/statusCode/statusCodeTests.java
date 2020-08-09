package statusCode;

import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import api.base.baseApi;

import static io.restassured.RestAssured.when;

public class statusCodeTests {

    private String baseUri = "https://generator.swagger.io/";
    private String basePathUri = "api/gen/";
    baseApi baseApi = new baseApi();

    @Test
    public void statusCodeCheckForServers() {
        String url = baseUri+basePathUri+"servers";
        baseApi.statusCodeCheck(url, 200);
    }

}
