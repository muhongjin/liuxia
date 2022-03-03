package com.example.remark.service;
import com.example.remark.utils.ResultBody;
public interface CreateService {
    ResultBody create(String name);
    ResultBody drop(String name);
    ResultBody exist(String name);
}
