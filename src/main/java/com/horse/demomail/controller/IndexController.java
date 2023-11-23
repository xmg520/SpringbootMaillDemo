package com.horse.demomail.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("test")
    public String admin(){
        return "madadalalallalalalalal";
    }

}
