package com.nagarro.awsassign.awsassign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AwsassignApplication {

	public static void main(String[] args) {

		SpringApplication.run(AwsassignApplication.class, args);
	}
	@GetMapping("/")
	public String getMessage(){
		String str = "Welcome to AWS Assignment.";
		return str;
	}

}
