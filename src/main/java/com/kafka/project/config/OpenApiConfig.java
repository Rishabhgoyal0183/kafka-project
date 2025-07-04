package com.kafka.project.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI kafkaProjectApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Kafka Sample Project API")
                        .version("v3")
                        .description("Endpoints for producing & consuming Kafka messages"))
                .externalDocs(new ExternalDocumentation()
                        .description("Project on GitHub, Please click and see the project code")
                        .url("https://github.com/Rishabhgoyal0183/kafka-project"));
    }
}
