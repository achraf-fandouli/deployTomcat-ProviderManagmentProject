package com.sip.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//extends SpringBootServletInitializer : le projet est basé sur servlet
public class AmsdataApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AmsdataApplication.class, args);
	}

}
