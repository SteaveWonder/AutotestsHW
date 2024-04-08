package homework3.seminar.accuweather;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import homework3.seminar.accuweather.AccuweatherAbstractTest;


import java.util.List;

import static io.restassured.RestAssured.given;

public class GetLocationTest extends AccuweatherAbstractTest {

    @Test
    void getLocation_autocomplete_returnSamara() {

        List<org.max.lesson3.home.accuweather.location.Location> response = given()
                .queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl()+"/locations/v1/cities/autocomplete?q=Samara")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(2000l))
                .extract()
                .body().jsonPath().getList(".", org.max.lesson3.home.accuweather.location.Location.class);

        Assertions.assertEquals(10,response.size());
        Assertions.assertEquals("Samara", response.get(0).getLocalizedName());
    }
    @Test
    void getLocation_autocomplete_returnOmsk() {

        List<org.max.lesson3.home.accuweather.location.Location> response = given()
                .queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl()+"/locations/v1/cities/autocomplete?q=Omsk")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(2000L))
                .extract()
                .body().jsonPath().getList(".", org.max.lesson3.home.accuweather.location.Location.class);

        Assertions.assertEquals(3,response.size());
        Assertions.assertEquals("Omsk", response.get(0).getLocalizedName());
    }
}
