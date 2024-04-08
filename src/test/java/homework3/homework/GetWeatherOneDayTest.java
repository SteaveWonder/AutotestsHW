package homework3.homework;

import homework3.seminar.accuweather.AccuweatherAbstractTest;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetWeatherOneDayTest extends AccuweatherAbstractTest {
    @Test
    void getWeatherOneDay_shouldReturn() {

        org.max.lesson3.home.accuweather.weather.Weather response = given()
                .queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl()+"/forecasts/v1/daily/1day/5")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(2000L))
                .extract()
                .response()
                .body().as(org.max.lesson3.home.accuweather.weather.Weather.class);

        Assertions.assertEquals(1,response.getDailyForecasts().size());
    }
}
