package com.example.juke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JukeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JukeApplication.class, args);
	}

}
