package io.pivotal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableJpaRepositories
@EnableDiscoveryClient
public class CloudNativeSpringWorkshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudNativeSpringWorkshopApplication.class, args);
	}

	@Value("${greeting:Hola}")
	private String _greeting;

	@RequestMapping("/")
	public String hello() {
		return _greeting + " World!";
	}
}
