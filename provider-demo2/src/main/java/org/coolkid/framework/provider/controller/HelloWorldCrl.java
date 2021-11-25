package org.coolkid.framework.provider.controller;

import lombok.SneakyThrows;
import org.coolkid.framework.base.api.vo.Result;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by coolkid on 2021/11/25.
 */

@RestController
@RequestMapping("/api")
public class HelloWorldCrl {
    @SneakyThrows
    @GetMapping(value = "/helloworld", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result helloWorld(){
        Thread.sleep(300);
        Result result = new Result();
        result.setMsg("hello world");
        result.setTs(new Date());
        result.setMid("2");
        return result;
    }
}
