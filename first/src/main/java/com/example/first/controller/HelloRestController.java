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
    // curl localhost:8080/hello/param/Naxayan -w "\n"
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + "!";
    }
    // curl -X POST -H "Content-Type: application/ison"
    //               -d '{"firstName": "Lisa", "lastName": "Harry"}'
    //   "http://localhost: 8080/hello/post" -w "\n"
    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + "  " + user.getLastName() + "!";
    }






}