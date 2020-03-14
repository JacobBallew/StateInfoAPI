package com.ballew.StateInfoApi;

import com.ballew.StateInfoApi.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StateInfoApiApplication implements CommandLineRunner {

	@Autowired
	private ApiService apiService;

	public static void main(String[] args) {
		SpringApplication.run(StateInfoApiApplication.class, args);
	}

	@Override
	public void run(String... args) {
		apiService.start();
	}

}
