package com.example.remark.controller;

import com.example.remark.service.SortService;
import com.example.remark.utils.ResultBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/v1")
public class SortController {
    @Autowired
    SortService sortService;
    @GetMapping("admin/twt/sort/exist")
    public ResultBody getExist(@RequestParam("name") String name){
        return sortService.getExist(name);
    }
    @GetMapping("admin/twt/sorts/num")
    public ResultBody getNum(){return sortService.getNum();}
    @PostMapping("admin/twt/sort")
    public ResultBody addSort(@RequestParam("name") String name,@RequestParam("time") double time){
        return sortService.addSort(name,time);
    }
    @DeleteMapping("admin/twt/sort")
    public ResultBody deleteUser(@RequestParam("name") String name) {
        return sortService.deleteSort(name);
    }
    @PutMapping("admin/twt/sort")
    public ResultBody changeSort(@RequestParam("name") String name,@RequestParam("newTime") double newTime){
        return  sortService.changeSort(name,newTime);
    }
    @GetMapping("admin/twt/sort/time")
    public ResultBody getTime(@RequestParam("name") String name){
        return sortService.getTime(name);
    }
    @GetMapping("admin/twt/sort")
    public ResultBody getSort(@RequestParam("name") String name){
        return sortService.getSort(name);
    }
    @GetMapping("admin/twt/ranking")
    public ResultBody getRanking(@RequestParam("name") String name){
        return sortService.getRanking(name);
    }
    @GetMapping("admin/twt/list")
    public ResultBody getList(@RequestParam("head") int n,@RequestParam("tail") int m){
        return sortService.getList(n,m);
    }
}
