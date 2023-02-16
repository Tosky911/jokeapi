package com.sc.jokeapi.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Generated;

import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "description",
        "language",
        "background",
        "category",
        "date",
        "joke"
})
@Generated("jsonschema2pojo")
public class JokeData {

    @JsonProperty("description")
    private String description;
    @JsonProperty("language")
    private String language;
    @JsonProperty("background")
    private String background;
    @JsonProperty("category")
    private String category;
    @JsonProperty("date")
    private String date;
    @JsonProperty("joke")
    private Joke joke;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<>();

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("background")
    public String getBackground() {
        return background;
    }

    @JsonProperty("background")
    public void setBackground(String background) {
        this.background = background;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("joke")
    public Joke getJoke() {
        return joke;
    }

    @JsonProperty("joke")
    public void setJoke(Joke joke) {
        this.joke = joke;
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
