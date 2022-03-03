package com.example.remark.service;

import com.example.remark.utils.ResultBody;

public interface UserService {
    ResultBody existUser(String name);
    ResultBody getUser(String name);
    ResultBody getNum(String name);
    ResultBody deleteUser(String name);
    ResultBody addUser(String name);
    ResultBody changeUser(String name,String newName);
    ResultBody getmore(String name);
}
