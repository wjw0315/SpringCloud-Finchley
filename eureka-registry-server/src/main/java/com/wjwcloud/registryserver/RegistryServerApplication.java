package com.wjwcloud.registryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author JiaweiWu
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryServerApplication.class, args);
	}

}
