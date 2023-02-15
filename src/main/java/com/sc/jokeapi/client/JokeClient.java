package com.sc.jokeapi.client;

import com.sc.jokeapi.model.JokeOTDResponse;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class JokeClient {

    //Builder pattern style fluent-API
    WebClient webClient = WebClient.builder()
            .baseUrl("https://api.jokes.one")
            .defaultCookie("cookie-name", "cookie-value")
            .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
            .build();

    public JokeOTDResponse getJokeOfTheDay(){
        return webClient.get()
                .uri("/jod")
                .accept(MediaType.asMediaType(MediaType.ALL))
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                /* Retrieve use case
                .retrieve()
                .bodyToMono(JokeOTDResponse.class)
                */
                .exchangeToMono(this::processJokeOTDResponse)
                .block();
    }

    private Mono<JokeOTDResponse> processJokeOTDResponse(ClientResponse clientResponse) {
        return clientResponse.statusCode().equals(HttpStatus.OK) ?
                clientResponse.bodyToMono(new ParameterizedTypeReference<>() {}) : processJokeOTDResponseError(clientResponse);
    }

    private Mono<JokeOTDResponse> processJokeOTDResponseError(ClientResponse clientResponse) {
        if (clientResponse.statusCode().equals(HttpStatus.NOT_FOUND)) {
            return Mono.empty();
        } else if (clientResponse.statusCode().is4xxClientError()) {
            return clientResponse.bodyToMono(String.class).flatMap(errorBody -> Mono.error(new Exception(errorBody)));

        } else if (clientResponse.statusCode().is5xxServerError()) {
            return clientResponse.bodyToMono(String.class).flatMap(errorBody -> Mono.error(new Exception(errorBody)));

        } else {
            return clientResponse.createException().flatMap(Mono::error);
        }
    }

}
