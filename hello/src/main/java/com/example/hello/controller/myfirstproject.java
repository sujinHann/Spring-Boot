package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myfirstproject {
        @GetMapping("/test")
        public String test() {
            return "My first Spring-boot project";
        }



}
