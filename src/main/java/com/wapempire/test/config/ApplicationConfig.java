package com.wapempire.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.wapempire.test")
@PropertySource("classpath:application.properties")
public class ApplicationConfig {

}
