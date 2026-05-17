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
  @Bean
  public UserDetailsService userDetailsService {
      UserDetails user1 = User
        .withDefaultPaswordEncoder()
        .username("shreya")
        .password("shreya@123")
        .roles("USER")
        .build();
      return new InMemoryUserDetailsManager();
  }

}
