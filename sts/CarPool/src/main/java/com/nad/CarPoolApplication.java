package com.nad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.nad")
@EntityScan(basePackages = "com.nad.entity")
@EnableJpaRepositories(basePackages = "com.nad.repo")
public class CarPoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarPoolApplication.class, args);
	}

}
