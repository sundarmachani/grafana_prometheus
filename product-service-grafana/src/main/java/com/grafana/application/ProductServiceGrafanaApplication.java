package com.grafana.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.product"})
public class ProductServiceGrafanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceGrafanaApplication.class, args);
	}

}
