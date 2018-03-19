package com.caacetc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@EnableTransactionManagement
@ServletComponentScan
@MapperScan("com.caacetc.*.dao")
@SpringBootApplication
public class CaacetcApplication {
    public static void main(String[] args) {
        SpringApplication.run(CaacetcApplication.class, args);
    }
}
