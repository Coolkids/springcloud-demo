package org.coolkid.framework.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by coolkid on 2021/11/25.
 */

@SpringBootApplication
@ComponentScan(basePackages={"org.coolkid"})
@EnableRedisHttpSession
public class ProviderRun {
    public static void main(String[] args) {
        SpringApplication.run(ProviderRun.class);
    }
}
