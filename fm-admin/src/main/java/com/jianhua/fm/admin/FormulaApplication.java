package com.jianhua.fm.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 配方管理系统启动类
 */
@SpringBootApplication
@MapperScan("com.jianhua.fm.**.mapper")
public class FormulaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FormulaApplication.class, args);
    }
}