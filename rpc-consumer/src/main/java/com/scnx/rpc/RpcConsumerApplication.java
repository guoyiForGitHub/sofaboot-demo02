package com.scnx.rpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.scnx.rpc.service.UserService;

@ImportResource("classpath:META-INF/spring/rpc-consumer.xml")
@SpringBootApplication
public class RpcConsumerApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(RpcConsumerApplication.class);
        ApplicationContext applicationContext = springApplication.run(args);

        UserService userService = (UserService) applicationContext
                .getBean("userService");

        System.out.println(userService.getName());
    }

}
