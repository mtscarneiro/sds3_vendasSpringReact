package com.mtscarntech.desvendas.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
<<<<<<< HEAD
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
=======
>>>>>>> 77b9f88fd07d72daac134e7b34b862c172ba2d6b
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
<<<<<<< HEAD
public class SecurityConfig extends WebSecurityConfigurerAdapter {
=======
public class SecurityConfig {
>>>>>>> 77b9f88fd07d72daac134e7b34b862c172ba2d6b

    @Autowired
    private Environment env;

<<<<<<< HEAD
    @Override
    protected void configure(HttpSecurity http) throws Exception {
=======
    protected void configuration(HttpSecurity http) throws Exception {
>>>>>>> 77b9f88fd07d72daac134e7b34b862c172ba2d6b
        if (Arrays.asList(env.getActiveProfiles()).contains("test")) {
            http.headers().frameOptions().disable();
        }

        http.cors().and().csrf().disable();
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.authorizeRequests().anyRequest().permitAll();
    }

    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration().applyPermitDefaultValues();
        configuration.setAllowedMethods(Arrays.asList("POST", "GET", "PUT", "DELETE", "OPTIONS"));
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }

}
