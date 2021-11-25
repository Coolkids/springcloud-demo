package org.coolkid.framework.consumer.controller;

import org.coolkid.framework.base.api.vo.Result;
import org.coolkid.framework.consumer.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by coolkid on 2021/11/25.
 */
@RestController
@RequestMapping("/client")
public class ConsumerCtrl {
    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping(value = "/helloworld", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result helloWorld(){
        return helloWorldService.helloworld();
    }

}
