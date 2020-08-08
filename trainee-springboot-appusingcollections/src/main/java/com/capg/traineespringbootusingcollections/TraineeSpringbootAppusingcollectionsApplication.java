package com.capg.traineespringbootusingcollections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.capg.traineespringbootusingcollections.controller","com.capg.traineespringbootusingcollections.service","com.capg.traineespringbootusingcollections.dao"})
public class TraineeSpringbootAppusingcollectionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TraineeSpringbootAppusingcollectionsApplication.class, args);
	}

}
