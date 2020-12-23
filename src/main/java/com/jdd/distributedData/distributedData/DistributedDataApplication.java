package com.jdd.distributedData.distributedData;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.jdd.distributedData.dubbo.consumer.controller")
@MapperScan(value = "com.jdd.distributedData.distributedData.dao.mapper")
@EnableAutoConfiguration
public class DistributedDataApplication {

    public static void main(String[] args) {

    	SpringApplication.run(DistributedDataApplication.class, args);
    }
}