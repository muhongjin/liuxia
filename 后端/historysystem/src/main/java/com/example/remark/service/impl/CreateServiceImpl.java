package com.example.remark.service.impl;

import com.example.remark.dao.CreateMapper;
import com.example.remark.service.CreateService;
import com.example.remark.utils.ResultBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CreateServiceImpl implements CreateService{
    @Autowired
    CreateMapper createMapper;
    @Override
    public ResultBody create(String name) {
        try{
            createMapper.create("t"+name);
            return ResultBody.success("成功建表"+name);
        }catch (Exception e){
            e.printStackTrace();
            return ResultBody.error("error");
        }
    }

    @Override
    public ResultBody drop(String name) {
        try{
            createMapper.drop("t"+name);
            return ResultBody.success("成功删表"+name);
        }catch (Exception e){
            e.printStackTrace();
            return ResultBody.error("error");
        }
    }

    @Override
    public ResultBody exist(String name) {
        try{
            return ResultBody.success(createMapper.exist("t"+name));
        }catch (Exception e){
            e.printStackTrace();
            return ResultBody.error("error");
        }
    }
}
