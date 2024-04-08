
package org.max.lesson3.home.accuweather.location;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Version",
    "Key",
    "Type",
    "Rank",
    "LocalizedName",
    "EnglishName",
    "PrimaryPostalCode",
    "Region",
    "Country",
    "AdministrativeArea",
    "TimeZone",
    "GeoPosition",
    "IsAlias",
    "SupplementalAdminAreas",
    "DataSets"
})
public class Location {

    @JsonProperty("Version")
    private Integer version;
    @JsonProperty("Key")
    private String key;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("Rank")
    private Integer rank;
    @JsonProperty("LocalizedName")
    private String localizedName;
    @JsonProperty("EnglishName")
    private String englishName;
    @JsonProperty("PrimaryPostalCode")
    private String primaryPostalCode;
    @JsonProperty("Region")
    private org.max.lesson3.home.accuweather.location.Region region;
    @JsonProperty("Country")
    private org.max.lesson3.home.accuweather.location.Country country;
    @JsonProperty("AdministrativeArea")
    private org.max.lesson3.home.accuweather.location.AdministrativeArea administrativeArea;
    @JsonProperty("TimeZone")
    private org.max.lesson3.home.accuweather.location.TimeZone timeZone;
    @JsonProperty("GeoPosition")
    private org.max.lesson3.home.accuweather.location.GeoPosition geoPosition;
    @JsonProperty("IsAlias")
    private Boolean isAlias;
    @JsonProperty("SupplementalAdminAreas")
    private List<org.max.lesson3.home.accuweather.location.SupplementalAdminArea> supplementalAdminAreas;
    @JsonProperty("DataSets")
    private List<String> dataSets;

    @JsonProperty("Version")
    public Integer getVersion() {
        return version;
    }

    @JsonProperty("Version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @JsonProperty("Key")
    public String getKey() {
        return key;
    }

    @JsonProperty("Key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("Rank")
    public Integer getRank() {
        return rank;
    }

    @JsonProperty("Rank")
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @JsonProperty("LocalizedName")
    public String getLocalizedName() {
        return localizedName;
    }

    @JsonProperty("LocalizedName")
    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
    }

    @JsonProperty("EnglishName")
    public String getEnglishName() {
        return englishName;
    }

    @JsonProperty("EnglishName")
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    @JsonProperty("PrimaryPostalCode")
    public String getPrimaryPostalCode() {
        return primaryPostalCode;
    }

    @JsonProperty("PrimaryPostalCode")
    public void setPrimaryPostalCode(String primaryPostalCode) {
        this.primaryPostalCode = primaryPostalCode;
    }

    @JsonProperty("Region")
    public org.max.lesson3.home.accuweather.location.Region getRegion() {
        return region;
    }

    @JsonProperty("Region")
    public void setRegion(org.max.lesson3.home.accuweather.location.Region region) {
        this.region = region;
    }

    @JsonProperty("Country")
    public org.max.lesson3.home.accuweather.location.Country getCountry() {
        return country;
    }

    @JsonProperty("Country")
    public void setCountry(org.max.lesson3.home.accuweather.location.Country country) {
        this.country = country;
    }

    @JsonProperty("AdministrativeArea")
    public org.max.lesson3.home.accuweather.location.AdministrativeArea getAdministrativeArea() {
        return administrativeArea;
    }

    @JsonProperty("AdministrativeArea")
    public void setAdministrativeArea(org.max.lesson3.home.accuweather.location.AdministrativeArea administrativeArea) {
        this.administrativeArea = administrativeArea;
    }

    @JsonProperty("TimeZone")
    public org.max.lesson3.home.accuweather.location.TimeZone getTimeZone() {
        return timeZone;
    }

    @JsonProperty("TimeZone")
    public void setTimeZone(org.max.lesson3.home.accuweather.location.TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    @JsonProperty("GeoPosition")
    public org.max.lesson3.home.accuweather.location.GeoPosition getGeoPosition() {
        return geoPosition;
    }

    @JsonProperty("GeoPosition")
    public void setGeoPosition(org.max.lesson3.home.accuweather.location.GeoPosition geoPosition) {
        this.geoPosition = geoPosition;
    }

    @JsonProperty("IsAlias")
    public Boolean getIsAlias() {
        return isAlias;
    }

    @JsonProperty("IsAlias")
    public void setIsAlias(Boolean isAlias) {
        this.isAlias = isAlias;
    }

    @JsonProperty("SupplementalAdminAreas")
    public List<org.max.lesson3.home.accuweather.location.SupplementalAdminArea> getSupplementalAdminAreas() {
        return supplementalAdminAreas;
    }

    @JsonProperty("SupplementalAdminAreas")
    public void setSupplementalAdminAreas(List<org.max.lesson3.home.accuweather.location.SupplementalAdminArea> supplementalAdminAreas) {
        this.supplementalAdminAreas = supplementalAdminAreas;
    }

    @JsonProperty("DataSets")
    public List<String> getDataSets() {
        return dataSets;
    }

    @JsonProperty("DataSets")
    public void setDataSets(List<String> dataSets) {
        this.dataSets = dataSets;
    }

}
