package com.sc.jokeapi.service;

import com.sc.jokeapi.client.JokeClient;
import com.sc.jokeapi.model.JokeOTDResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.Disposable;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class JokeService {

    @Autowired
    private JokeClient jokeClient;

    public Mono<String> getJokeOfTheDay(){
        log.debug("Getting joke text from jokeapi response");
        return jokeClient.getJokeOfTheDay().map(response -> response.getContents().getJokes().get(0).getText());
    }
}
