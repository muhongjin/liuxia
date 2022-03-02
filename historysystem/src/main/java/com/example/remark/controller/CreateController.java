package com.example.remark.controller;

import com.example.remark.service.CreateService;
import com.example.remark.utils.ResultBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/v1")
public class CreateController {
    @Autowired
    CreateService createService;
    @PostMapping("/admin/twt/history/table")
    public ResultBody create(@RequestParam("name") String name){
        return createService.create(name);
    }
    @DeleteMapping("/admin/twt/history/table")
    public ResultBody drop(@RequestParam("name") String name){
        return createService.drop(name);
    }
    @GetMapping("/admin/twt/history/table")
    public ResultBody exist(@RequestParam("name") String name){
        return createService.exist(name);
    }
}
