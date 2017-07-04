package com.code.fcms;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FcmsApplication {

	private final static Logger logger = Logger.getLogger(FcmsApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(FcmsApplication.class, args);
		logger.info("Application started!");
	}
}
