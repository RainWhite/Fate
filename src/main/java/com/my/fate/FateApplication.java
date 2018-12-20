package com.my.fate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@SpringBootApplication(exclude = {
//        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
//})
@SpringBootApplication
@EnableCaching
@MapperScan("com.my.fate.dao")
public class FateApplication {

    public static void main(String[] args) {
        SpringApplication.run(FateApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/*").allowedOrigins("*");
            }
        };
    }
}
