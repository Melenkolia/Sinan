package TestCase_Assertions;

import org.testng.Assert;

public class Assertions {

    public void verifyMovieHeader(String Text1, String Text2){

        Assert.assertEquals(Text1, Text2, "Movie Could Not Be Verified");
    }
}
