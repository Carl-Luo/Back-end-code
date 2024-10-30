package com.txl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.txl.dao")
public class AbApplication {

    public static void main(String[] args) {
        SpringApplication.run(AbApplication.class, args);
    }

}
