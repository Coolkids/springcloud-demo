package org.coolkid.framework.gateway.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.server.EnableRedisWebSession;

/**
 * Created by coolkid on 2021/11/26.
 */
@SpringBootApplication
@EnableRedisWebSession
public class GateWayRun {
    public static void main(String[] args) {
        SpringApplication.run(GateWayRun.class);
    }
}
