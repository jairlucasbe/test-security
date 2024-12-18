package com.example.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception{
        return httpSecurity
        .csrf(Customizer.withDefaults())
        .authorizeHttpRequests(authz -> {
            authz.requestMatchers("/v1/index2").permitAll()
            authz.anyRequest().authenticated();
        })
        .formLogin(Customizer.withDefaults()) 
        .build();
    }
}
