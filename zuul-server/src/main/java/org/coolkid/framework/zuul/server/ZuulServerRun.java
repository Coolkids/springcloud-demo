package org.coolkid.framework.zuul.server;

import org.coolkid.framework.zuul.server.filter.SimpleFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Created by coolkid on 2021/11/26.
 */

@SpringBootApplication
@EnableZuulProxy
public class ZuulServerRun {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServerRun.class);
    }

    @Bean
    public SimpleFilter simpleFilter() {
        return new SimpleFilter();
    }
}
