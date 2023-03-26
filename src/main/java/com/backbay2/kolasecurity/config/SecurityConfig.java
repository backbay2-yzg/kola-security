package com.backbay2.kolasecurity.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@Slf4j
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    Environment env;
    @Value("${management.endpoints.web.base-path}")
    private String basePath;
    //@Value("${management.access.white-list}")
    //private String whiteList;


    @Override
    protected void configure(HttpSecurity security) throws Exception {

        String actuatorPath = env.getProperty(basePath);

        if (StringUtils.isEmpty(actuatorPath)) {
            actuatorPath = "";
        }
        log.info("actuatorPath is : {}",actuatorPath);
        security.csrf().disable()
                .authorizeRequests()
                .antMatchers("/**" + actuatorPath + "/**")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .and()
                .httpBasic();

    }
}