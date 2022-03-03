package com.example.remark.dao;

import com.example.remark.utils.ResultBody;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CreateMapper {
    int create(String name);
    int drop(String name);
    int exist(String name);
}
