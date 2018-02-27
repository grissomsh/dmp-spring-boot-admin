package io.daocloud.microservices.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.spring4all.swagger.EnableSwagger2Doc;

import de.codecentric.boot.admin.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableSwagger2Doc
public class SystemAdminServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemAdminServiceApplication.class, args);
	}
}
