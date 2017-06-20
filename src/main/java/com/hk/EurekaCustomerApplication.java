package com.hk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * eureka 消费都应用
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaCustomerApplication.class, args);
	}
}
