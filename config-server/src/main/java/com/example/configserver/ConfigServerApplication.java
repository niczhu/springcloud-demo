package com.example.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableConfigServer
@SpringBootApplication
@EnableEurekaClient
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

    /**
     * hhttp访问配置
     * <hostname>/<prot>/fileName/key
     * http://localhost:8088/config-client-dev/foo
     *
     * spring.application.name：          对应文件规则的应用名
     * spring.cloud.config.profile：      对应环境名
     * spring.cloud.config.label：        对应分支名
     *
     */

}
