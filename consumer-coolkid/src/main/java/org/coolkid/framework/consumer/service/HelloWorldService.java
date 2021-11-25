package org.coolkid.framework.consumer.service;

import org.coolkid.framework.base.api.vo.Result;
import org.coolkid.framework.consumer.callback.HelloWorldServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by coolkid on 2021/11/25.
 */

@Component
@FeignClient(value = "PROVIDER-COOLKID", fallbackFactory = HelloWorldServiceFallbackFactory.class)
public interface HelloWorldService {
    @GetMapping(value = "/provider-coolkid/api/helloworld")
    public Result helloworld();
}
