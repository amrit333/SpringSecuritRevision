package com.example.SpringSecurityLearning.Configration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfigration {
    @Bean
    public SecurityFilterChain configration(HttpSecurity security){
           return security.csrf(request -> request.disable())
                    .authorizeHttpRequests( request -> request.

                            requestMatchers("/user/**").permitAll()
                            .anyRequest().authenticated())
                    .httpBasic(basic-> basic.disable())
                    .build();

    }


}
