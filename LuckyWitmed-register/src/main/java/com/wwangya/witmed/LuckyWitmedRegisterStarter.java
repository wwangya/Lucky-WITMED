package com.wwangya.witmed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <b></b>
 *
 * @author WWY
 * 2022/7/3
 */
@SpringBootApplication
@EnableEurekaServer
public class LuckyWitmedRegisterStarter {
	public static void main(String[] args) {
		SpringApplication.run(LuckyWitmedRegisterStarter.class, args);
	}
}
