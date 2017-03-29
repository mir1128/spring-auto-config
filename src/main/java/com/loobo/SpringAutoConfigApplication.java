package com.loobo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(AppConfig.class)
public class SpringAutoConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAutoConfigApplication.class, args);
	}
}
