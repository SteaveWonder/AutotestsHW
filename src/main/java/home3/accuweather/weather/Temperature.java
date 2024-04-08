
package org.max.lesson3.home.accuweather.weather;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Minimum",
    "Maximum"
})
public class Temperature {

    @JsonProperty("Minimum")
    private org.max.lesson3.home.accuweather.weather.Minimum minimum;
    @JsonProperty("Maximum")
    private org.max.lesson3.home.accuweather.weather.Maximum maximum;

    @JsonProperty("Minimum")
    public org.max.lesson3.home.accuweather.weather.Minimum getMinimum() {
        return minimum;
    }

    @JsonProperty("Minimum")
    public void setMinimum(org.max.lesson3.home.accuweather.weather.Minimum minimum) {
        this.minimum = minimum;
    }

    @JsonProperty("Maximum")
    public org.max.lesson3.home.accuweather.weather.Maximum getMaximum() {
        return maximum;
    }

    @JsonProperty("Maximum")
    public void setMaximum(org.max.lesson3.home.accuweather.weather.Maximum maximum) {
        this.maximum = maximum;
    }

}
