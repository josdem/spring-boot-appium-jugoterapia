package com.jos.dem.springboot.appium.jugoterapia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class AppiumJugoterapiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppiumJugoterapiaApplication.class, args);
	}

}
