package org.coolkid.framework.provider.controller;

import lombok.SneakyThrows;
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
public class HelloWorldCtrl {
    @SneakyThrows
    @GetMapping(value = "/helloworld", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result helloWorld(HttpSession session) {
        Object id = session.getAttribute("id");
        Thread.sleep(500);
        Result result = new Result();
        result.setMsg("hello world");
        result.setTs(new Date());
        result.setMid("1");
        result.setSessionId(String.valueOf(id));
        return result;
    }
}
