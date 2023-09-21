package com.dzero.olegion.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 网关启动类
 *
 * @author DZero
 * @date 2023-09-21
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OlegionGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(OlegionGatewayApplication.class, args);
    }
}