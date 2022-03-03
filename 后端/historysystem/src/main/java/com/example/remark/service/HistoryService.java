package com.example.remark.service;
import com.example.remark.utils.ResultBody;
public interface HistoryService {
    ResultBody addHistory(String name,double time);
    ResultBody getAll(String name);
    ResultBody getNum(String name);
}
