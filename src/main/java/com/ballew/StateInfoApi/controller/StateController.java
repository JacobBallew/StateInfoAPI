package com.ballew.StateInfoApi.controller;

import com.ballew.StateInfoApi.dao.H2Dao;
import com.ballew.StateInfoApi.domain.Greeting;
import com.ballew.StateInfoApi.domain.State;
import com.ballew.StateInfoApi.domain.StringToJSON;
import com.ballew.StateInfoApi.misc.Util;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StateController {

    private ObjectMapper mapper;

    @Autowired
    public StateController(){
        this.mapper = new ObjectMapper();
    }

    @Autowired
    private H2Dao h2Dao;

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting("Hello " + name);
    }

    @GetMapping("/status")
    public StringToJSON status() {
        return StringToJSON.getAsJSON("StateInfo API is running");
    }

    @GetMapping("/getStateByName")
    public State getStateByName(@RequestParam(value = "stateName") String stateName) {
        return h2Dao.getStateByName(stateName);
    }

    @GetMapping("/getAll")
    public List<State> getAll() {
        return h2Dao.getAll();
    }
}
