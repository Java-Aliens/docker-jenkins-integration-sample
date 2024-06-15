package com.alien;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerJenkinsIntegrationSampleApplication {

	@GetMapping("/welcome")
	public String disp() {
		return "Hi Welcome to docker using jenkins build";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsIntegrationSampleApplication.class, args);
	}

}
