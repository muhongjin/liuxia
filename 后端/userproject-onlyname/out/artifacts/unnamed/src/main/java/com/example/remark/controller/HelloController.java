//package com.example.remark.controller;
//import lombok.SneakyThrows;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Random;
//
//@RestController
//@RequestMapping("/v1")
//@Slf4j
//public class HelloController {
//    @SneakyThrows
//    @GetMapping("/sayHello/{name}")
//    public String sayHello(@PathVariable("name") String name) {
//        Thread.sleep(new Random().nextInt(5) * 1000);
//        return "Hello " + name;
//    }
//}
