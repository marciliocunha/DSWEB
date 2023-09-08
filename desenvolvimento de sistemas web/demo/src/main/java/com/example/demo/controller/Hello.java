package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servidor")
public class Hello {
    @GetMapping("/Hello")
    public String getHello(){

        return "Hello World";

    }

    @PostMapping("/Post")
    public String getpost(){

        return "Posted";

    }

    @DeleteMapping("/Del")
    public String getDel(){

        return "Deleted";

    }

    @PutMapping("/Put")
    public String getPut(){

        return "Put";

    }

    

}
