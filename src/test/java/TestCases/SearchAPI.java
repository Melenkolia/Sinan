package TestCases;

import EndPointsMethod.KariyerNetEndpoints;
import GeneralAssertions.KariyerNetAssertions;
import Pojo.BreadCrumb;
import Pojo.Jobs;
import Pojo.MainResponse;
import Utilities.ConfigUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import jdk.jfr.Description;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import org.apache.http.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class SearchAPI extends ConfigUtil implements KariyerNetEndpoints {

    JSONParser parser = new JSONParser();
    KariyerNetAssertions assertions = new KariyerNetAssertions();
    private String jsonResponse;

    @Description("Kariyer Net /search Endpoint Happy Path Test Senaryosu")
    @Test(priority = 1, description = "Response Body bulunan Multi-Level JSON içerisinde bulunan Objelerin Key - Value Pair durumları kontrol edilmiştir.")
    public void TA_KariyerNet_SearchAPI() throws ParseException, IOException, net.minidev.json.parser.ParseException {

        Object searchRequestBody = parser.parse(CaseText("case-text/searchRequestBody.txt"));
        JSONObject jsonObject = (JSONObject) searchRequestBody;

        Response searchResponse = KariyerNetSearch("/search", searchRequestBody);

        jsonResponse = searchResponse.getBody().asString();
        ObjectMapper objectMapper = new ObjectMapper();

        MainResponse response = objectMapper.readValue(jsonResponse, MainResponse.class);

        assertions.verifyMainResponse(response);
        assertions.verifyDataResponse(response);

        BreadCrumb breadCrumb = response.getData().getBreadCrumb();
        assertions.verifyBreadCrumb(breadCrumb);

        Jobs jobs = response.getData().getJobs();
        assertions.verifyJobs(jobs);





    }
}
