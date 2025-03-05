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
    // curl localhost:8080/hello/query?name=Naxayan -w "\n"
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + "1";
    }



}