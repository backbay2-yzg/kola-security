package com.backbay2.kolasecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
//@EnableWebSecurity
//public class ActuatorSecurityConfig{
//
//  @Autowired
//  Environment env;
//
//
//
//    //@Override
//  //protected void configure(HttpSecurity security) throws Exception {
//  //
//  //      String contextPath = env.getProperty("management.endpoints.web.base-path");
//  //      if(StringUtils.isEmpty(contextPath)) {
//  //          contextPath = "";
//  //      }
//  //      security.csrf().disable();
//  //      security.authorizeRequests()
//  //              .antMatchers("/**"+contextPath+"/**")
//  //              .authenticated()
//  //              .anyRequest()
//  //              .permitAll()
//  //              .and()
//  //              .httpBasic();
//  //
//  //   }
//}