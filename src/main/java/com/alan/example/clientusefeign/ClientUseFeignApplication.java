package com.alan.example.clientusefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients(basePackageClasses = {com.alan.feign.client.IClientRest.class})
public class ClientUseFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientUseFeignApplication.class, args);
    }
}
