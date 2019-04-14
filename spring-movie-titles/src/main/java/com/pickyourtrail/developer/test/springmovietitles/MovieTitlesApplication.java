package com.pickyourtrail.developer.test.springmovietitles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class MovieTitlesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieTitlesApplication.class, args);
	}

}
