package com.springsecutiry.arlei.modules.ativos.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
// Anotação para o spring ja reconheça minhas regras de autenticação
public class securityConfig {

 @Bean
 SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(
                        authorizeConfig -> {
                             authorizeConfig.requestMatchers("/ativos/buscarTodos").permitAll();
                             authorizeConfig.requestMatchers("/logout").permitAll();
                             // Acima permitindo que os endpoints marcados sejam acessados sem autenticação...
                             authorizeConfig.anyRequest().authenticated();
                             // aqui configurando que os demais endpoints so devem ser acessados com autemticação
                         }).oauth2Login(Customizer.withDefaults())
                // usando uma autenticação básica. agora mudei para oauth2
                 .build();
     }
 }