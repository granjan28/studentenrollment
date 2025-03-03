package com.demo.studentenrollment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class StudentenrollmentApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(StudentenrollmentApplication.class, args);
	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**") // Apply CORS to all endpoints
				.allowedOrigins("http://localhost:4200") // Specify allowed origins
				.allowedMethods("POST", "PUT", "PATCH", "GET", "OPTIONS", "DELETE") // Allowed HTTP methods
				.allowedHeaders("*") // Allow all headers
				.allowCredentials(true) // Allow credentials (cookies, authorization headers, etc.)
				.maxAge(3600); // Cache pre-flight requests for 1 hour
	}
}
