package com.mypaytrans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.mypaytrans.config.RibbonConfiguration;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RibbonClient(name="mypaytransaction",configuration = RibbonConfiguration.class)
public class MyPayApiTransactionApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyPayApiTransactionApplication.class, args);
	}

}
