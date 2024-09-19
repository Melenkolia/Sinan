package EndPointsMethod;

import Specifications.RestAssured_Specifications;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.given;

public interface KariyerNetEndpoints {
    default Response KariyerNetSearch(String path, Object payload) {

        RequestSpecification requestSpecification = new RestAssured_Specifications().KariyerNetRequestSpec();
        ResponseSpecification responseSpecification = new RestAssured_Specifications().KariyerNetResponseSpec();
        Response response;
        response = given(requestSpecification).
                headers("Accept", "application/json, text/plain, */*").
                headers("Content-Type", "application/json;charset=UTF-8").
                when().
                body(payload).
                post(path).
                then().spec(responseSpecification).
                statusCode(200).
                extract().
                response();

        return response;
    }
}
