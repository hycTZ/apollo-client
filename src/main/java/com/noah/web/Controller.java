package com.noah.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${search.switch}")
    private boolean switchFlag;


    @RequestMapping("/search")
    public String search(){
        return "apollo-config:" + switchFlag;
    }

}
