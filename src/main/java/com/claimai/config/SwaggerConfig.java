package com.claimai.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("ClaimAI Backend API")
                        .version("1.0.0")
                        .description("AI-Powered Claims Processing Platform Backend APIs")
                        .contact(new Contact()
                                .name("Apurupa Prathipati")
                                .email("apurupa810@gmail.com")
                        )
                );
    }
}
