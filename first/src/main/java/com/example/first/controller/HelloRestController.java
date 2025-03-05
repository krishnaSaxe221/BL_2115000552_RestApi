package com.example.first.controller;


import org.springframework.web.bind.annotation .*;
import com.example.first.model.User;

@RestController

@RequestMapping("/hello")
public class HelloRestController {

    // curl localhost:8080/hello -w "\n"
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello From BridgeLabz! ! !";

    }


}