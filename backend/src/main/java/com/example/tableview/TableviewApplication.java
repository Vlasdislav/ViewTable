package com.example.tableview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class TableviewApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(TableviewApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8086"));
		app.run(args);
	}
}
