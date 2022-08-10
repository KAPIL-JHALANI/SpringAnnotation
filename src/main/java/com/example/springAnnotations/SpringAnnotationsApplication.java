package com.example.springAnnotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationsApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringAnnotationsApplication.class, args);

		ApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college=context.getBean("collgebeanhai", College.class);
		college.test();
	}

}
