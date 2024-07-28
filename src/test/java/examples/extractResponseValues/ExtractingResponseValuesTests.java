package examples.extractResponseValues;

import examples.baseTests.baseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ExtractingResponseValuesTests extends baseTests {

    @Test
    public void testExtractingResponseValues() {

        String placeName =

        given().
                spec(requestSpecification).
        when().
                get("us/90210").
        then().
                extract().
                path("places[0].'place name'");

        Assert.assertEquals(placeName, "Beverly Hills");
    }
}
