
package org.max.lesson3.home.accuweather.weather;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Headline",
    "DailyForecasts"
})
public class Weather {

    @JsonProperty("Headline")
    private org.max.lesson3.home.accuweather.weather.Headline headline;
    @JsonProperty("DailyForecasts")
    private List<org.max.lesson3.home.accuweather.weather.DailyForecast> dailyForecasts;

    @JsonProperty("Headline")
    public org.max.lesson3.home.accuweather.weather.Headline getHeadline() {
        return headline;
    }

    @JsonProperty("Headline")
    public void setHeadline(org.max.lesson3.home.accuweather.weather.Headline headline) {
        this.headline = headline;
    }

    @JsonProperty("DailyForecasts")
    public List<org.max.lesson3.home.accuweather.weather.DailyForecast> getDailyForecasts() {
        return dailyForecasts;
    }

    @JsonProperty("DailyForecasts")
    public void setDailyForecasts(List<org.max.lesson3.home.accuweather.weather.DailyForecast> dailyForecasts) {
        this.dailyForecasts = dailyForecasts;
    }

}
