package com.ballew.StateInfoApi.controller;

import com.ballew.StateInfoApi.domain.Greeting;
import com.ballew.StateInfoApi.domain.StringToJSON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StateController {

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting("Hello " + name);
    }

    @GetMapping("/status")
    public StringToJSON status() {
        return StringToJSON.getAsJSON("API is running");
    }
}
