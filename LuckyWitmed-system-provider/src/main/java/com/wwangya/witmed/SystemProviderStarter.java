package com.wwangya.witmed;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <b>SystemProvider启动类</b>
 *
 * @author WWY
 * 2022/7/3
 */
@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.wwangya.*.*.witmed.dao")
public class SystemProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(SystemProviderStarter.class, args);
	}
}
