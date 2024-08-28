package com.ibc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringbootCarRentalGatewayServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCarRentalGatewayServiceAppApplication.class, args);
	}

}
