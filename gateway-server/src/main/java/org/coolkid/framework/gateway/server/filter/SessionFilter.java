package org.coolkid.framework.gateway.server.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Objects;
import java.util.UUID;

/**
 * Created by coolkid on 2021/11/26.
 */

@Component
@Slf4j
public class SessionFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        exchange.getSession().map(
                session -> {
                    if(Objects.isNull(session.getAttribute("id2"))){
                        session.getAttributes().put("id2", UUID.randomUUID().toString());
                    }
                    return session;
                }
        );
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
