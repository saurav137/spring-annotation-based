package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean
    public Movie getMovie(){
        return new Movie();
    }

    @Bean
    public Actor getActor(){
        return new Actor("Tejveer",25,"Male");
    }

    @Bean
    public BeanLifecycleDemo beanLifecycleDemo(){
        return new BeanLifecycleDemo();
    }

}
