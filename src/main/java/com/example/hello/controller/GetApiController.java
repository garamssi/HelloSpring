package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

        @GetMapping(path = "/hello") // http://localhost:9090/api/get/hello
        public String getHello() {
                return "get Hello";
        }

        // 예전에 쓰던 방식 get, post, put, delete 모든 메소드가 맵핑
        @RequestMapping(path="/hi", method = RequestMethod.GET)  // get  http://localhost:9090/api/get/hi
        public String hi(){
                return "hi";
        }

}
