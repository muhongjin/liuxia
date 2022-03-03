package com.example.remark.dao;

import com.example.remark.entity.History;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface HistoryMapper {
    int getNum(String name);
    int addRecord(String name,int num,double time);
    History getRecord(String name, int num);
}
