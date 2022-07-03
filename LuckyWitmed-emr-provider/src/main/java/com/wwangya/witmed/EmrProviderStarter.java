package com.wwangya.witmed;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <b></b>
 *
 * @author WWY
 * 2022/7/3
 */
@SpringBootApplication
@MapperScan("com.wwangya.witmed.dao")
@EnableEurekaClient
public class EmrProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(EmrProviderStarter.class, args);
	}
}
