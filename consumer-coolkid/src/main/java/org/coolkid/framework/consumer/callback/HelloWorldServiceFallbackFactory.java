package org.coolkid.framework.consumer.callback;

import org.coolkid.framework.base.api.vo.Result;
import org.coolkid.framework.consumer.service.HelloWorldService;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by coolkid on 2021/11/25.
 */

@Component
public class HelloWorldServiceFallbackFactory implements FallbackFactory<HelloWorldService> {

    @Override
    public HelloWorldService create(Throwable cause) {
        return () -> new Result("error", new Date(), "1");
    }
}
