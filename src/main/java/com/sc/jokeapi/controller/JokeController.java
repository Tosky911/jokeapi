package com.sc.jokeapi.controller;

import com.sc.jokeapi.service.JokeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Mono;

@Slf4j
@Controller
public class JokeController {
    @Autowired
    private JokeService jokeService;

    @GetMapping("/jokeotd")
    @ResponseBody
    public Mono<String> getJokeOfTheDay(){
        log.debug("Request received to get joke of the day >>>>>");
        return jokeService.getJokeOfTheDay();
    }

}
