package examples;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ParameterizedTests {

    @Test(dataProvider = "testData", dataProviderClass = TestData.class)
    public void testAPICallsWithDifferentSetOfData(String countryCode, String zipCode, String expectedPlaceName) {
        given().
                pathParam("countryCode", countryCode).pathParam("zipCode", zipCode).
                when().
                get("http://api.zippopotam.us/{countryCode}/{zipCode}").
                then().
                assertThat()
                .body("places[0].'place name'", equalTo(expectedPlaceName));
    }
}
