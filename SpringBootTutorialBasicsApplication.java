package com.simu.example.springboottutorialbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootTutorialBasicsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootTutorialBasicsApplication.class, args);
		ApplicationContext applicationContext = SpringApplication.run(SpringBootTutorialBasicsApplication.class, args);
		
		//System.out.println(applicationContext.getBeanDefinitionNames());
		
		for (String name: applicationContext.getBeanDefinitionNames()) {
            System.out.println("->" +name);
        }
	}
}
