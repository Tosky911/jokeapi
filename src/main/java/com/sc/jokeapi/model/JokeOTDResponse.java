package com.sc.jokeapi.model;

import com.fasterxml.jackson.annotation.*;
import lombok.Generated;

import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "success",
        "contents"
})
@Generated("jsonschema2pojo")
public class JokeOTDResponse {

    @JsonProperty("success")
    private Success success;
    @JsonProperty("contents")
    private Contents contents;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<>();

    @JsonProperty("success")
    public Success getSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(Success success) {
        this.success = success;
    }

    @JsonProperty("contents")
    public Contents getContents() {
        return contents;
    }

    @JsonProperty("contents")
    public void setContents(Contents contents) {
        this.contents = contents;
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