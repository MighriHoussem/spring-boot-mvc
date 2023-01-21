package com.training.mvc.mvcspringboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    /* private final PasswordEncoder passwordEncoder;

    public SecurityConfig ()
    {
        this.passwordEncoder =  new BCryptPasswordEncoder();
    }*/

    @Bean
    public UserDetailsService userDetailsService (PasswordEncoder passwordEncoder) {
        UserDetails admin = User.withUsername("Houssem")
                .password(passwordEncoder.encode("Houssem74#"))
                .roles("ADMIN")
                .build();

        UserDetails user = User.withUsername("Ahmed")
                .password(passwordEncoder.encode("Ahmed74#"))
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(admin, user);
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/rooms").permitAll()
                .and()
                .authorizeHttpRequests()
                .requestMatchers("/api/**").authenticated()
                .and().formLogin();
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }
}
