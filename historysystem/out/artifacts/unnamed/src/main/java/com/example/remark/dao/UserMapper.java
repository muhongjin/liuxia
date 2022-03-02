package com.example.remark.dao;

import com.example.remark.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    User getUser(String name);
    //接口，根据 name 返回 User 类//签名
    int deleteUser(String name);
    int addUser(String name);
    int changeUser(String name,String newName);
    int getNum(String name);
    User getMore(String name,int num);
}
