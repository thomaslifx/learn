package com.boil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Description spring boot的启动类,添加MapperScan是扫描mybatis通用 mapper所在的包
 * @author lifuxiang
 * @date 2020/8/20 16:17
 */
@SpringBootApplication
@MapperScan(basePackages = "com.boil.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
