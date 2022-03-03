package com.example.remark.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface HaoMapper {
    int getHao(String name);
    int addHao(String name,int num);
    int changeHao(String name,int num);
}
