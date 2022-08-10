package com.example.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerGateway {
    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p.path("/film/ticket/**")
                        .uri("http://localhost:8088/film/**"))
                .route(p -> p.path("/film/**")
                        .uri("http://localhost:8088/film/**"))
                .route(p -> p.path("/ticket/**")
                        .uri("http://localhost:8089/ticket/**"))
                .build();
    }
}
