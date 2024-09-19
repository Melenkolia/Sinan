package Specifications;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static Utilities.ConfigUtil.baseURL;

public class RestAssured_Specifications {
    public RequestSpecification KariyerNetRequestSpec() {
        return new RequestSpecBuilder().
                setBaseUri(baseURL.getProperty("BaseURL")).
                //addHeader("X-Transaction-Id",randomTransaction()).
//                        addFilter(new AllureRestAssured()).
        log(LogDetail.ALL).build();
    }

    public ResponseSpecification KariyerNetResponseSpec() {
        return new ResponseSpecBuilder().
                log(LogDetail.ALL).
                log(LogDetail.BODY).
                build();
    }
}
