package com.oracle.hrb.fistekserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//加入此注册将项目变成Eureka服务器
@EnableEurekaServer
public class FistEkServerApplication {

    public static void main(String[] args) {
      new SpringApplicationBuilder(FistEkServerApplication.class).profiles("slave2").run(args);
    }

}
