package GeneralAssertions;

import Pojo.BreadCrumb;
import Pojo.Jobs;
import Pojo.MainResponse;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.testng.Assert;

public class KariyerNetAssertions {

    public void verifyMainResponse(MainResponse response){

        Assert.assertEquals(response.getStatusCode(), "Success", "Expected status code to be 'Success', but was: " + response.getStatusCode());
        Assert.assertEquals(response.getStatus(), "Success", "Expected status to be 'Success', but was: " + response.getStatus());
        Assert.assertNull(response.getMessage(), "Expected message to be null, but was: " + response.getMessage());
        Assert.assertNull(response.getError(), "Expected error to be null, but was: " + response.getError());
    }

    public void verifyDataResponse(MainResponse response){

        Assert.assertNotNull(response.getData().getTotalJobCount(), "Expected total job count to be not null, but it is null.");
        Assert.assertNotNull(response.getData().getTotalJobCountWithOutSponsored(), "Expected total job count without sponsored to be not null, but it is null.");
        Assert.assertNotNull(response.getData().getTitle(), "Expected title to be not null, but it is null.");
        Assert.assertEquals(response.getData().getTitle(), "Ankara İş İlanları & Güncel Ankara Eleman Arayan Firmalar", "Expected Title to be 'Ankara İş İlanları & Güncel Ankara Eleman Arayan Firmalar', but was: " + response.getData().getTitle());
        Assert.assertNotNull(response.getData().getSearchUrl(), "Expected search URL to be not null, but it is null.");
        Assert.assertNotNull(response.getData().getBreadCrumb(), "Expected BreadCrumb to be not null, but it is null.");
        Assert.assertNotNull(response.getData().getJobs(), "Expected jobs list to be not null, but it is null.");
        Assert.assertNotNull(response.getData().getJobSeo(), "Expected job SEO data to be not null, but it is null.");
        Assert.assertNotNull(response.getData().getCurrentPage(), "Expected current page to be not null, but it is null.");
        Assert.assertEquals(response.getData().isSearched(), true, "Expected searched flag to be true, but it was false.");

    }

    public void verifyBreadCrumb(BreadCrumb breadCrumb){

        Assert.assertNotNull(breadCrumb.getItems(), "BreadCrumb items should not be null");
        for (BreadCrumb.Item item : breadCrumb.getItems()) {
            Assert.assertNotNull(item.getText(), "BreadCrumb item text should not be null");
            Assert.assertNotNull(item.getUrl(), "BreadCrumb item url should not be null");
        }
        BreadCrumb.Item thirdItem = breadCrumb.getItems().get(2);
        Assert.assertEquals(thirdItem.getText(), "Ankara İş İlanları", "The text of the third BreadCrumb item does not match the expected value.");
    }

    public void verifyJobs(Jobs jobs){

        Assert.assertNotNull(jobs.getItems(), "BreadCrumb items should not be null");
        for (Jobs.Job item : jobs.getItems()) {
            Assert.assertNotNull(item.getId(), "Expected item ID to be not null, but it is null.");
            Assert.assertNotNull(item.getTitle(), "Expected item title to be not null, but it is null.");
            Assert.assertNotNull(item.getCompanyName(), "Expected company name to be not null, but it is null.");
            Assert.assertNotNull(item.getJobUrl(), "Expected job URL to be not null, but it is null.");
            Assert.assertNotNull(item.getCompanyUrl(), "Expected company URL to be not null, but it is null.");
//            Assert.assertNull(item.getLogoUrl(), "Expected logo URL to be null, but it is not null.");
            Assert.assertNotNull(item.getFullPathLogoUrl(), "Expected full path logo URL to be not null, but it is null.");
            Assert.assertNotNull(item.getLocationText(), "Expected location text to be not null, but it is null.");
            Assert.assertFalse(item.isSponsored(), "Expected isSponsored to be false, but it is true.");
            Assert.assertFalse(item.isHumanReward(), "Expected humanReward to be false, but it is true.");
            Assert.assertNotNull(item.getWorkType(), "Expected work type to be not null, but it is null.");
            Assert.assertNotNull(item.getWorkTypeText(), "Expected work type text to be not null, but it is null.");
            Assert.assertNotNull(item.getJobDateText(), "Expected job date text to be not null, but it is null.");
            Assert.assertEquals(item.getMemberJobStatus(), "Default", "Expected member job status to be 'Default', but it is different.");
            Assert.assertFalse(item.isHandicapped(), "Expected isHandicapped to be false, but it is true.");
            Assert.assertFalse(item.isFavorite(), "Expected isFavorite to be false, but it is true.");
            Assert.assertFalse(item.isHasVideo(), "Expected hasVideo to be false, but it is true.");
            Assert.assertFalse(item.isHasIso(), "Expected hasIso to be false, but it is true.");
            Assert.assertNotNull(item.getCompanyId(), "Expected company ID to be not null, but it is null.");
            Assert.assertNotNull(item.getProfileId(), "Expected profile ID to be not null, but it is null.");
            Assert.assertNotNull(item.getJobDateStatus(), "Expected job date status to be not null, but it is null.");
            Assert.assertNotNull(item.getPostingDate(), "Expected posting date to be not null, but it is null.");
            Assert.assertFalse(item.isConfidential(), "Expected confidential to be false, but it is true.");
            Assert.assertNotNull(item.isOnlyPublishedOnKariyerNet(), "Expected onlyPublishedOnKariyerNet to be not null, but it is null.");
            Assert.assertNotNull(item.getIsLogoSelected(), "Expected isLogoSelected to be not null, but it is null.");
            Assert.assertNotNull(item.getShowTime(), "Expected show time to be not null, but it is null.");
            Assert.assertNotNull(item.getPositionLevel(), "Expected position level to be not null, but it is null.");
            Assert.assertNotNull(item.getAllLocations(), "Expected allLocations to be not null, but it is null.");
            Assert.assertNotNull(item.getSquareLogoUrl(), "Expected square logo URL to be not null, but it is null.");
            Assert.assertFalse(item.isDisaster(), "Expected isDisaster to be false, but it is true.");
            Assert.assertNotNull(item.getWorkModel(), "Expected work model to be not null, but it is null.");
            Assert.assertNotNull(item.isEasyApply(), "Expected isEasyApply to be not null, but it is null.");
            Assert.assertNotNull(item.getJobCode(), "Expected job code to be not null, but it is null.");
//            Assert.assertNull(item.getAppliedDetail(), "Expected appliedDetail to be null, but it is not null.");
            Assert.assertNotNull(item.getPositionId(), "Expected position ID to be not null, but it is null");

        }
    }

    public void verifyResponseJsonSchema(Response response, String schema){
        response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath(schema));

    }
}
