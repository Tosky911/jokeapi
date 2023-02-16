package com.sc.jokeapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.annotation.Generated;

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


}