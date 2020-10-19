package com.mindtree.inventoryservcie;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients
//@EnableEurekaClient
@SpringBootApplication
public class InventoryServcieApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServcieApplication.class, args);
	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}
