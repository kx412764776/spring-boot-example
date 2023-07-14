package com.amigoscode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingpongController {

    private static int COUNTER = 0;

    record Pingpong(String result) { }

    @GetMapping("/ping")
    public Pingpong getPingPong(){
        return new Pingpong("Pong: %s".formatted(++COUNTER));
    }
}
