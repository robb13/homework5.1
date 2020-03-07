
package pl.bykowski.home51.homework51.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "title",
    "event_date_utc",
    "event_date_unix",
    "flight_number",
    "details",
    "links"
})
public class History {

    public History(Integer id, String title, String eventDateUtc, Integer eventDateUnix, Integer flightNumber, String details, Links links, Map<String, Object> additionalProperties) {
        this.id = id;
        this.title = title;
        this.eventDateUtc = eventDateUtc;
        this.eventDateUnix = eventDateUnix;
        this.flightNumber = flightNumber;
        this.details = details;
        this.links = links;
        this.additionalProperties = additionalProperties;
    }

    public History() {
    }

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("event_date_utc")
    private String eventDateUtc;
    @JsonProperty("event_date_unix")
    private Integer eventDateUnix;
    @JsonProperty("flight_number")
    private Integer flightNumber;
    @JsonProperty("details")
    private String details;
    @JsonProperty("links")
    private Links links;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("event_date_utc")
    public String getEventDateUtc() {
        return eventDateUtc;
    }

    @JsonProperty("event_date_utc")
    public void setEventDateUtc(String eventDateUtc) {
        this.eventDateUtc = eventDateUtc;
    }

    @JsonProperty("event_date_unix")
    public Integer getEventDateUnix() {
        return eventDateUnix;
    }

    @JsonProperty("event_date_unix")
    public void setEventDateUnix(Integer eventDateUnix) {
        this.eventDateUnix = eventDateUnix;
    }

    @JsonProperty("flight_number")
    public Integer getFlightNumber() {
        return flightNumber;
    }

    @JsonProperty("flight_number")
    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    @JsonProperty("details")
    public String getDetails() {
        return details;
    }

    @JsonProperty("details")
    public void setDetails(String details) {
        this.details = details;
    }

    @JsonProperty("links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "History{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", eventDateUtc='" + eventDateUtc + '\'' +
                ", eventDateUnix=" + eventDateUnix +
                ", flightNumber=" + flightNumber +
                ", details='" + details + '\'' +
                ", links=" + links +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
