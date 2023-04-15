package com.capgemini.pfe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class M02WebClient  extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(M02WebClient.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(M02WebClient.class);
	}
}
