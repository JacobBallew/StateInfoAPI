package com.jacobballew.StateInfoApi;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class StateInfoApiApplication implements ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(StateInfoApiApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("StateInfo API stated!");
    }
}
