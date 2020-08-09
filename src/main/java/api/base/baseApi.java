package api.base;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.when;

public class baseApi {

    public void statusCodeCheck(String url, int statusCode) {

        RestAssured.given();
        when().get(url).then().statusCode(statusCode);
    }
}
