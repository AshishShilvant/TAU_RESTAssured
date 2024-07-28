package examples.responseSpecification;

import examples.baseTests.baseTests;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ResponseSpecificationTests extends baseTests {

    @Test
    public void testResponseSpecificationConfigs() {
        given().
                spec(requestSpecification).
        when().
                get("us/90210").
        then().
                spec(responseSpecification).
                and().
                assertThat().
                body("places[0].'place name'", equalTo("Beverly Hills"));
    }
}
