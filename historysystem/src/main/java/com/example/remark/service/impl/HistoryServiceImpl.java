package com.example.remark.service.impl;

import com.example.remark.dao.CreateMapper;
import com.example.remark.dao.HistoryMapper;
import com.example.remark.entity.History;
import com.example.remark.service.HistoryService;
import com.example.remark.utils.ResultBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoryServiceImpl implements HistoryService {
    @Autowired
    CreateMapper createMapper;
    @Autowired
    HistoryMapper historyMapper;
    @Override
    public ResultBody addHistory(String name, double time) {
        try{
            int k=createMapper.exist("t"+name);
            if(k==0)createMapper.create("t"+name);
            int n=historyMapper.getNum("t"+name);
            return ResultBody.success(historyMapper.addRecord("t"+name,n+1,time));
        }catch (Exception e){
            e.printStackTrace();
            return ResultBody.error("error");
        }
    }

    @Override
    public ResultBody getAll(String name) {
        try{
            int k=createMapper.exist("t"+name);
            if(k==0)return ResultBody.success("无记录");
            int n=historyMapper.getNum("t"+name);
            if(n==0)return ResultBody.success("无记录");
            History[] historyList =new History[n];
            for(int i=0;i<n;i++){
                historyList[i]=historyMapper.getRecord("t"+name,i+1);
            }
            return ResultBody.success(historyList);
        }catch (Exception e){
            e.printStackTrace();
            return ResultBody.error("error");
        }
    }

    @Override
    public ResultBody getNum(String name) {
        try{
            int k=createMapper.exist("t"+name);
            if(k==0)return ResultBody.success(0);
            int n=historyMapper.getNum("t"+name);
            return ResultBody.success(n);
        }catch (Exception e){
            e.printStackTrace();
            return ResultBody.error("error");
        }
    }

}
