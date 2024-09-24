package com.reactive.computelematic.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.reactive.computelematic")
public class ComputelematicApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComputelematicApplication.class, args);
	}

}
