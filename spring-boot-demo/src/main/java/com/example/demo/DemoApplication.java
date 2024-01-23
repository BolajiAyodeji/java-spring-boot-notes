package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
		// test url: http://localhost:8080/hello?name=Bolaji
	}

	@GetMapping("/add")
	public int add(
			@RequestParam(value = "x", defaultValue = "0") int x,
			@RequestParam(value = "y", defaultValue = "0") int y) {
		return x + y;
		// test url: http://localhost:8080/add?x=12&y=76
	}
}