
package org.max.lesson3.home.accuweather.location;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Metric",
    "Imperial"
})
public class Elevation {

    @JsonProperty("Metric")
    private org.max.lesson3.home.accuweather.location.Metric metric;
    @JsonProperty("Imperial")
    private org.max.lesson3.home.accuweather.location.Imperial imperial;

    @JsonProperty("Metric")
    public org.max.lesson3.home.accuweather.location.Metric getMetric() {
        return metric;
    }

    @JsonProperty("Metric")
    public void setMetric(org.max.lesson3.home.accuweather.location.Metric metric) {
        this.metric = metric;
    }

    @JsonProperty("Imperial")
    public org.max.lesson3.home.accuweather.location.Imperial getImperial() {
        return imperial;
    }

    @JsonProperty("Imperial")
    public void setImperial(org.max.lesson3.home.accuweather.location.Imperial imperial) {
        this.imperial = imperial;
    }

}
