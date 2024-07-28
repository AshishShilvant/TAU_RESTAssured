package examples;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetMethodTests {

    @Test
    public void testGetMethodCallOnGivenAPI() {
        given().
                when().
                get("http://api.zippopotam.us/us/90210").
                then().
                assertThat().
                statusCode(200);
    }

    @Test
    public void testContentTypeFromResponse() {
        given().
                when().
                get("http://api.zippopotam.us/us/90210").
                then().
                assertThat().
                contentType(ContentType.JSON);
    }

    @Test
    public void testLoggingRequestAndResponseDetails() {
        given().
                log().all().
                when().
                get("http://api.zippopotam.us/us/90210").
                then().
                log().body();
    }

    @Test
    public void testPlaceNameFromResponseBody() {
        given().
                when().
                get("http://api.zippopotam.us/us/90210").
                then().
                assertThat()
                .body("places[0].'place name'", equalTo("Beverly Hills"));
    }

    @Test
    public void testStateNameFromResponseBody() {
        given().
                when().
                get("http://api.zippopotam.us/us/90210").
                then().
                assertThat()
                .body("places[0].'state'", equalTo("California"));
    }

    @Test
    public void testPlaceNameFromResponse() {
        given().
                when().
                get("http://api.zippopotam.us/us/90210").
                then().
                assertThat()
                .body("places.'place name'", hasItem("Beverly Hills"));
    }

    @Test
    public void testNumberOfPlacesFromResponse() {
        given().
                when().
                get("http://api.zippopotam.us/us/90210").
                then().
                assertThat()
                .body("places.'place name'", hasSize(1));
    }
}
