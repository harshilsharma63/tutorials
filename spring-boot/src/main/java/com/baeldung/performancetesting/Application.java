package com.baeldung.performancetesting;

import com.baeldung.autoconfiguration.MySQLAutoconfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.handler.HandlerMappingIntrospector;

@SpringBootApplication(exclude = {MySQLAutoconfiguration.class})
@ComponentScan(basePackages = "com.baeldung.performancetesting")
public class Application {

    public static void main(String[] args) {
        System.out.println("hello");
        SpringApplication.run(Application.class, args);
    }

    @Bean(name = "mvcHandlerMappingIntrospector")
    public HandlerMappingIntrospector mvcHandlerMappingIntrospector(ApplicationContext context) {
        return new HandlerMappingIntrospector(context);
    }
}
