package org.state.service.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableEurekaClient
@EnableWebMvc

public class EurekaServiceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceDemoApplication.class, args);
	}
}
