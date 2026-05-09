package com.nishith.reserveShow.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HomeController {
    @RequestMapping("/")
    public String urls(){
        return "This was a Backend project. use postMan or any api testing tools to test the project" ;
    }
}
