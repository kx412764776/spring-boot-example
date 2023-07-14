package com.amigoscode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChenHuijinController {

    record Huijin(String Huijin) {}

    @GetMapping("/chen")
     public Huijin getHuijin() {
         return new Huijin("Hi, Huijin");
     }
}
