package com.Nirmitee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class NirmiteeAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(NirmiteeAssignmentApplication.class, args);
		
		System.out.println("Everything is under control");
	}

}
