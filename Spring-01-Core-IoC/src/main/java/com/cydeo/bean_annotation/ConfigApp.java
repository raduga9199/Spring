package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class ConfigApp {
    @Bean
    FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor();
    }

    @Bean // (name = "p1")
    @Primary // (default)
    PartTimeMentor partTimeMentor(){
        return new PartTimeMentor();
    }

    @Bean // (name = "p2")
    PartTimeMentor partTimeMentor2(){
        return new PartTimeMentor();
    }
}
