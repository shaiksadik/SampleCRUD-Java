package com.sampleexample.SamlpleCRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sampleexample.SamlpleCRUD")
public class SamlpleCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamlpleCrudApplication.class, args);
	}

}
