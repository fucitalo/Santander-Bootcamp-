package com.project.santanderBootcamp;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SantanderBootcampApplication {

	public static void main(String[] args) {
		SpringApplication.run(SantanderBootcampApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI(@Value("${application.description}") String description, @Value("${application.version}") String version){
		return new OpenAPI().info(new Info()
				.title(description)
				.version(version)
				.termsOfService("http://swager.io/terms")
				.license(new License().name("apache 2.0").url("http://springdoc.org"))
		);
	}

}
