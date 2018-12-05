package com.coderxx.jblog.config;

import com.coderxx.jblog.property.CrossProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private CrossProperty crossProperty;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").
                allowCredentials(true).
                allowedHeaders("*").
                allowedOrigins(crossProperty.getOrigin()).
//                allowedOrigins("http://localhost:8081").
                allowedMethods("*");
//
//        registry
//                .addMapping("/**")
//                .allowedOrigins("http://localhost")
////                .allowedMethods("PUT", "DELETE")
////                .allowedHeaders("header1", "header2", "header3")
////                .exposedHeaders("header1", "header2")
////                .allowCredentials(false)
//                .maxAge(3600);
    }
}
