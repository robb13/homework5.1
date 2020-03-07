
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
    "reddit",
    "article",
    "wikipedia"
})
public class Links {

    public Links(Object reddit, String article, String wikipedia, Map<String, Object> additionalProperties) {
        this.reddit = reddit;
        this.article = article;
        this.wikipedia = wikipedia;
        this.additionalProperties = additionalProperties;
    }

    public Links() {
    }

    @JsonProperty("reddit")
    private Object reddit;
    @JsonProperty("article")
    private String article;
    @JsonProperty("wikipedia")
    private String wikipedia;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("reddit")
    public Object getReddit() {
        return reddit;
    }

    @JsonProperty("reddit")
    public void setReddit(Object reddit) {
        this.reddit = reddit;
    }

    @JsonProperty("article")
    public String getArticle() {
        return article;
    }

    @JsonProperty("article")
    public void setArticle(String article) {
        this.article = article;
    }

    @JsonProperty("wikipedia")
    public String getWikipedia() {
        return wikipedia;
    }

    @JsonProperty("wikipedia")
    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
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
        return "Links{" +
                "reddit=" + reddit +
                ", article='" + article + '\'' +
                ", wikipedia='" + wikipedia + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
