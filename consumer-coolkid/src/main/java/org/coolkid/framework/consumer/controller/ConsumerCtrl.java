package org.coolkid.framework.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.coolkid.framework.base.api.vo.Result;
import org.coolkid.framework.consumer.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Objects;
import java.util.UUID;

/**
 * Created by coolkid on 2021/11/25.
 */
@RestController
@RequestMapping("/client")
@Slf4j
public class ConsumerCtrl {
    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping(value = "/helloworld", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result helloWorld(HttpSession session, HttpServletRequest request){
        log.error("consumer sessionid:{}", session.getId());
        if(Objects.isNull(session.getAttribute("id"))){
            session.setAttribute("id", UUID.randomUUID().toString());
        }
        return helloWorldService.helloworld();
    }

}
