package com.jdd.distributedData.distributedData;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.jdd.distributedData.distributedData.dao.mapper")
public class DistributedDataApplication {

    public static void main(String[] args) {

    	SpringApplication.run(DistributedDataApplication.class, args);
    }
}