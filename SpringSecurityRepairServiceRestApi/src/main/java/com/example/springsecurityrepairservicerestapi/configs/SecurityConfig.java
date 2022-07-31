package com.example.springsecurityrepairservicerestapi.configs;


import com.example.springsecurityrepairservicerestapi.services.UserService;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    final UserService userService;
    public SecurityConfig(UserService userService) {
        this.userService = userService;
    }

    // slq -> query => user control
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService).passwordEncoder(userService.encoder());
    }

    // rol yönetim izin merkezi ->
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
                httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/product/**").hasRole("product")
                .antMatchers("/user/**").permitAll()
                .and()
                .csrf().disable()
                .formLogin().disable();
    }



}
