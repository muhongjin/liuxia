package com.example.remark.controller;

import com.example.remark.dao.HistoryMapper;
import com.example.remark.service.HistoryService;
import com.example.remark.utils.ResultBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/v1")
public class HistoryController {
    @Autowired
    HistoryService historyService;
    @PostMapping("/admin/twt/history")
    public ResultBody addHistory(@RequestParam("name")String name, @RequestParam("time")double time){return historyService.addHistory(name, time);}
    @GetMapping("/admin/twt/history")
    public ResultBody getAll(@RequestParam("name")String name){return historyService.getAll(name);}
    @GetMapping("/admin/twt/history/num")
    public ResultBody getNum(@RequestParam("name")String name){return historyService.getNum(name);}
}
