package com.apisgov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class APIsGOV {
    public static void main(String[] args){
        SpringApplication.run(APIsGOV.class, args);
    }
}
