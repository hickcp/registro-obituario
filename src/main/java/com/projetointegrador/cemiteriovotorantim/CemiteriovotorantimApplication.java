package com.projetointegrador.cemiteriovotorantim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class CemiteriovotorantimApplication {

	public static void main(String[] args) {
		SpringApplication.run(CemiteriovotorantimApplication.class, args);
	}

}
