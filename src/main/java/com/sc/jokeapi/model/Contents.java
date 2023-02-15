package com.sc.jokeapi.model;

import com.fasterxml.jackson.annotation.*;
import lombok.Generated;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "jokes",
        "copyright"
})
@Generated("jsonschema2pojo")
public class Contents {

    @JsonProperty("jokes")
    private List<Joke> jokes;
    @JsonProperty("copyright")
    private String copyright;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<>();

    @JsonProperty("jokes")
    public List<Joke> getJokes() {
        return jokes;
    }

    @JsonProperty("jokes")
    public void setJokes(List<Joke> jokes) {
        this.jokes = jokes;
    }

    @JsonProperty("copyright")
    public String getCopyright() {
        return copyright;
    }

    @JsonProperty("copyright")
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

