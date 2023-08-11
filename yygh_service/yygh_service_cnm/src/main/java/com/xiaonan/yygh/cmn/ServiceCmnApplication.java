package com.xiaonan.yygh.cmn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * ServiceCmnApplication
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/11 14:53
 * @say 山河总静好，人事也从容
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.xiaonan")
public class ServiceCmnApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceCmnApplication.class, args);
    }
}