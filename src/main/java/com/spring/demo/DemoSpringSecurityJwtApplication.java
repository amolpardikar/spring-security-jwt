package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.spring.demo.config.RsaKeyProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class DemoSpringSecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringSecurityJwtApplication.class, args);
	}

}
