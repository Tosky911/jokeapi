package com.sc.jokeapi.service;

import com.sc.jokeapi.client.JokeClient;
import com.sc.jokeapi.model.JokeOTDResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class JokeService {

    private JokeClient jokeClient;

    public String getJokeOfTheDay(){
        JokeOTDResponse response = jokeClient.getJokeOfTheDay();
        //Since it's only 1 joke inside Jokes we use 0 index
        return response.getContents().getJokes().get(0).getText();
    }
}
