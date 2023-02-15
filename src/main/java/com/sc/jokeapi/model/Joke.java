package com.sc.jokeapi.model;

import com.fasterxml.jackson.annotation.*;
import lombok.Generated;

import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "title",
        "lang",
        "length",
        "clean",
        "racial",
        "date",
        "id",
        "text"
})
@Generated("jsonschema2pojo")
public class Joke {

    @JsonProperty("title")
    private String title;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("length")
    private String length;
    @JsonProperty("clean")
    private String clean;
    @JsonProperty("racial")
    private String racial;
    @JsonProperty("date")
    private String date;
    @JsonProperty("id")
    private String id;
    @JsonProperty("text")
    private String text;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<>();

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("length")
    public String getLength() {
        return length;
    }

    @JsonProperty("length")
    public void setLength(String length) {
        this.length = length;
    }

    @JsonProperty("clean")
    public String getClean() {
        return clean;
    }

    @JsonProperty("clean")
    public void setClean(String clean) {
        this.clean = clean;
    }

    @JsonProperty("racial")
    public String getRacial() {
        return racial;
    }

    @JsonProperty("racial")
    public void setRacial(String racial) {
        this.racial = racial;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
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
