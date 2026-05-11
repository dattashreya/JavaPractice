package com.demo.SpringSecurityEx.config;
import org.framework.context.annotation.Configuration;

@Configuration
@EnableWebSecurity
  public class SecurityConfig {
  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    return http
    .csrf(customizer -> customizer.disable())
    .authorizeHttpRequests(request -> request.anyRequest().authenticated())
    .httpBasic(Customizer.withDefaults())
    .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
    .build();
  }
}
