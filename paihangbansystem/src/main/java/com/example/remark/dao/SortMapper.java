package com.example.remark.dao;

import com.example.remark.entity.Sort;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SortMapper {
    Sort getSort(String name);
    //接口，根据 name 返回 Sort 类//签名
    int deleteSort(String name);
    int addSort(String name,double time);
    int changeSort(String name,double newTime);
    double getTime(String name);
    int getNum();
    int getSingleNum(String name);
    int getRanking1(double time);
    int getRanking2(String name,double time);
    Sort getList(int n);
}
