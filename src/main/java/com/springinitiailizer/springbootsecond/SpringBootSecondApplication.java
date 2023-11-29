package com.springinitiailizer.springbootsecond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringBootSecondApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecondApplication.class, args);



	}



}


