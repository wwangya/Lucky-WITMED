package com.wwangya.witmed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <b></b>
 *
 * @author WWY
 * 2022/7/3
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class EmrConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(EmrConsumerStarter.class, args);
	}
}
