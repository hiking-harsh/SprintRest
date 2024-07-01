package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
    @GetMapping("/users")
    public String handleGet(){
        return "Get Request applied on /api/users";
    }
    @PostMapping("/users")
//    public String handlePost(){
//        return "Post Request applied on /api/users";
//    }
    public String handlePost(@RequestBody UserData user){
        return "Post Request applied on /api/users"+"  ADDRESS : "+user.address +"   AGE : "+user.age+"  NAME : "+user.name;
    }
}
