package com.sc.jokeapi.client;

import com.sc.jokeapi.model.JokeOTDResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class JokeClient {

    public Mono<JokeOTDResponse> getJokeOfTheDay(){
        return webClient()
                .get()
                .uri("/jod")
                .accept(MediaType.asMediaType(MediaType.ALL))
                //Retrieve use case
                .retrieve()
                .bodyToMono(JokeOTDResponse.class);
    }

    private WebClient webClient(){
        return WebClient.builder()
                .baseUrl("https://api.jokes.one")
                .defaultCookie("cookie-name", "cookie-value")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

}
