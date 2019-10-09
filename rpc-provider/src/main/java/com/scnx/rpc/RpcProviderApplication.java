package com.scnx.rpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:META-INF/spring/rpc-provider.xml")
@SpringBootApplication
public class RpcProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpcProviderApplication.class, args);
	}

}
