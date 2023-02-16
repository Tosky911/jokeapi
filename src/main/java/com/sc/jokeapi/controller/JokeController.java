package com.sc.jokeapi.controller;

import com.sc.jokeapi.service.JokeService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@AllArgsConstructor
public class JokeController {
    private JokeService jokeService;

    @RequestMapping("/jokeotd")
    public String getJokeOfTheDay(){
        return jokeService.getJokeOfTheDay();
    }

}
