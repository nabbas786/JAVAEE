package com.nad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(scanBasePackages = "com.nad" , exclude={DataSourceAutoConfiguration.class})

public class ImApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImApplication.class, args);
	}

}
