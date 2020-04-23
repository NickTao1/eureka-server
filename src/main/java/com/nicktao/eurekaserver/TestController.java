package com.nicktao.eurekaserver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("t")
public class TestController {

    @RequestMapping("/test")
    @ResponseStatus
    public  String test(){
        System.out.println("aaaa");
        return "sss";
    }
}
