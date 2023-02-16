package com.sc.jokeapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class JokeConfig {

    //Builder pattern style fluent-API
    @Bean
    public WebClient webClient(){
        return WebClient.builder()
                .baseUrl("https://api.jokes.one")
                .defaultCookie("cookie-name", "cookie-value")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }
}
