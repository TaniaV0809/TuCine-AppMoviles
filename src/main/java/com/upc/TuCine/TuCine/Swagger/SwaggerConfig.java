package com.upc.TuCine.TuCine.Swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@OpenAPIDefinition
public class SwaggerConfig {
    public OpenAPI api(){
        return new OpenAPI().servers(List.of(new Server().url("https://backend-tucine-production.up.railway.app")));
    }
}
