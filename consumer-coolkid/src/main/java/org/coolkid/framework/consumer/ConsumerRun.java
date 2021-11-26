package org.coolkid.framework.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by coolkid on 2021/11/25.
 */

@SpringBootApplication
@ComponentScan(basePackages={"org.coolkid"})
@EnableFeignClients(basePackages = {"org.coolkid"})
@EnableRedisHttpSession
@EnableHystrix
public class ConsumerRun {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerRun.class);
    }
}
