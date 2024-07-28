package examples;

import examples.baseTests.baseTests;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RequestSpecificationTests extends baseTests {

    @Test
    public void testLoadingBaseURLFromRequestSpecification() {
        given().
                spec(requestSpecification).
        when().
                get("us/90210").
        then().
                assertThat().
                statusCode(200);
    }
}
