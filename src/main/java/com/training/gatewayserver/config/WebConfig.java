package com.training.gatewayserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class WebConfig {
	 @Bean
	    public CorsWebFilter corsWebFilter() {
	        CorsConfiguration config = new CorsConfiguration();
	        config.setAllowCredentials(true);
	        config.addAllowedOriginPattern("*"); // Or specific origins like "http://localhost:3000"
	        config.addAllowedHeader("*");
	        config.addAllowedMethod("*"); // Or limit to GET, POST, etc.
	        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	        source.registerCorsConfiguration("/**", config); // Apply to all routes
	        return new CorsWebFilter(source);
	    }
}
