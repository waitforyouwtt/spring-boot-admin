package com.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@EnableHystrix
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientTwoApplication.class, args);
	}
}
