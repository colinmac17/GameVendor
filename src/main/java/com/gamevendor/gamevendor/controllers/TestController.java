package com.gamevendor.gamevendor.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String getHelloWorld(@RequestParam String name) {
        return "Hello " + name;
    }

}