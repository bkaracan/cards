package com.bkaracan.card;

import com.bkaracan.card.dto.CardContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {CardContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Card microservice REST API Documentation",
				description = "Bank Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Burak Karacan",
						email = "burakkaracan94@gmail.com"
				),
				license = @License(
						name = "Apache 2.0"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Bank Cards microservice REST API Documentation"
		)
)
public class CardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardApplication.class, args);
	}

}
