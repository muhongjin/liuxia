package com.example.remark.service.impl;

import com.example.remark.dao.UserMapper;
import com.example.remark.entity.User;
import com.example.remark.service.UserService;
import com.example.remark.utils.ResultBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public ResultBody getmore(String name) {
        int num;
        num=userMapper.getNum(name)-1;
        if(num==-1) return ResultBody.error("不存在此用户");
        try {
            User[] userList= new User[num+1];
            for(int i=0;i<=num;i++) {
                userList[i]=userMapper.getMore(name, i);
            }
            return ResultBody.successMore(userList,num+1);
        }catch (Exception e){
            e.printStackTrace();
            return ResultBody.error("第"+num+"条未成功提取");
        }
    }

    @Override
    public ResultBody existUser(String name) {
        try{
            int num;
            num=userMapper.getNum(name);
            if(num>=1) return ResultBody.success("该用户名已被注册");
            else return ResultBody.success("该用户名未被注册");
        }catch (Exception e){
            e.printStackTrace();
            return ResultBody.error("error");
        }
    }

    @Override
    public ResultBody getUser(String name){
        try{
            return ResultBody.success(userMapper.getUser(name));
        }catch (Exception e){
            e.printStackTrace();
            return ResultBody.error("error");
        }
    }

    @Override
    public ResultBody getNum(String name) {
        try{
            return ResultBody.success5(userMapper.getNum(name));
        }catch (Exception e){
            e.printStackTrace();
            return ResultBody.error("获取条数失败");
        }
    }

    @Override
    public ResultBody deleteUser(String name) {
        try {
            return ResultBody.success2(userMapper.deleteUser(name));
        }catch (Exception e){
            e.printStackTrace();
            return ResultBody.error("error");
        }
    }

    @Override
    public ResultBody addUser(String name) {
        try {
            return ResultBody.success3(userMapper.addUser(name));
        }catch (Exception e){
            e.printStackTrace();
            return ResultBody.error("error");
        }
    }

    @Override
    public ResultBody changeUser(String name,String newName) {
        try{
            return ResultBody.success4(userMapper.changeUser(name,newName));
        }catch (Exception e){
            e.printStackTrace();
            return ResultBody.error("error");
        }
    }
}
