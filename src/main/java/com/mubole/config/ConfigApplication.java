package com.mubole.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Description: 配置启动类
 * @Author: fanmanfu
 * @CreateDate: 2019/6/25 0025 10:30
 * @UpdateUser: fanmanfu
 * @UpdateDate: 2019/6/25 0025 10:30
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */

@EnableConfigServer //开启配置中心功能
@SpringBootApplication
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}
