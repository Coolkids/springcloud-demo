package org.coolkid.framework.provider.controller;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.coolkid.framework.base.api.vo.Result;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created by coolkid on 2021/11/25.
 */

@RestController
@RequestMapping("/api")
@Slf4j
public class HelloWorldCtrl {
    @SneakyThrows
    @GetMapping(value = "/helloworld", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result helloWorld(HttpSession session){
        log.info("provider2 sessionid:{}", session.getId());
        Object id = session.getAttribute("id");
        Result result = new Result();
        result.setMsg("hello world");
        result.setTs(new Date());
        result.setMid("2");
        result.setSessionId(String.valueOf(id));
        return result;
    }
}
