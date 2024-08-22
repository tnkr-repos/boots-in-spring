package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpring {

    public static void main(String[] args) {
        
        // Launch an Application Context
        var context = new 
            AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
    
        // Create Beans using @Configuration class
    }
}
