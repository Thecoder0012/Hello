package com.example.hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping(path = "/")
    public String homepage(){
        return "index";
    }
}
