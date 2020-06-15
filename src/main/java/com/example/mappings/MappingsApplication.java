package com.example.mappings;


import com.example.mappings.controller.SampleController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import java.util.Properties;

@SpringBootApplication
public class MappingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MappingsApplication.class, args);
	}

	@Bean
	public SimpleUrlHandlerMapping sampleServletMapping() {
		System.out.println("::::::::::::::::::::::::::::::::SimpleUrlHandlerMapping:::::::::::::::::::::::::::::::::");
		SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
		mapping.setOrder(Integer.MAX_VALUE - 2);

		Properties urlProperties = new Properties();
		urlProperties.put("/index", sampleController());
		mapping.setMappings(urlProperties);

		return mapping;
	}

	@Bean
	public SampleController sampleController() {
		System.out.println("::::::::::::::::::::::::::::::::Setting SampleController:::::::::::::::::::::::::::::::::");
		return new SampleController();
	}
}
