package com.example.remark.service;

import com.example.remark.utils.ResultBody;

public interface SortService {
    ResultBody getExist(String name);
    ResultBody getSort(String name);
    ResultBody getNum();
    ResultBody deleteSort(String name);
    ResultBody addSort(String name,double time);
    ResultBody changeSort(String name,double newTime);
    ResultBody getTime(String name);
    ResultBody getRanking(String name);
    ResultBody getList(int n,int m);

}
