package com.example.remark.service.impl;
import com.example.remark.dao.SortMapper;
import com.example.remark.entity.Sort;
import com.example.remark.service.SortService;
import com.example.remark.utils.ResultBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class SortServiceImpl implements SortService {
    @Autowired
    SortMapper sortMapper;
    @Override
    public ResultBody getExist(String name) {
        try{
            return ResultBody.success(sortMapper.getSingleNum(name));
        }catch (Exception e) {
            e.printStackTrace();
            return ResultBody.error("查询存在性");
        }
    }
    @Override
    public ResultBody getSort(String name) {
        try{
            return ResultBody.success(sortMapper.getSort(name));
        }catch (Exception e){
            e.printStackTrace();
            return ResultBody.error("查询名字时间组合失败");
        }
    }
    @Override
    public ResultBody getNum() {
        try{
            return ResultBody.success(sortMapper.getNum());
        }catch (Exception e) {
            e.printStackTrace();
            return ResultBody.error("获取总数失败");
        }
    }

    @Override
    public ResultBody deleteSort(String name) {
        try {
            return ResultBody.success(sortMapper.deleteSort(name));
        }catch (Exception e){
            e.printStackTrace();
            return ResultBody.error("删除失败");
        }
    }

    @Override
    public ResultBody addSort(String name,double time) {
        try {
            int n=sortMapper.getSingleNum(name);
            if(n==0) return ResultBody.success(sortMapper.addSort(name,time));
            else return ResultBody.error("排行榜里已有同名者，请勿添加同名者，请使用put方法修改");
        }catch (Exception e){
            e.printStackTrace();
            return ResultBody.error("添加失败");
        }
    }

    @Override
    public ResultBody changeSort(String name, double newTime) {
        try{
            return ResultBody.success(sortMapper.changeSort(name,newTime));
        }catch (Exception e){
            e.printStackTrace();
            return ResultBody.error("更改失败");
        }
    }

    @Override
    public ResultBody getTime(String name) {
        try {
            return ResultBody.success(sortMapper.getTime(name));
        }catch (Exception e){
            e.printStackTrace();
            return ResultBody.error("查询时间失败");
        }
    }

    @Override
    public ResultBody getRanking(String name) {
        try {
            int ranking;
            double n;
            n = sortMapper.getTime(name);
            ranking = sortMapper.getNum()-sortMapper.getRanking1(n)-sortMapper.getRanking2(name,n);
            return ResultBody.success(ranking);
        }catch (Exception e){
            e.printStackTrace();
            return ResultBody.error("查询排名失败");
        }
    }

    @Override
    public ResultBody getList(int n, int m) {
        try {
            int maxn;
            maxn =sortMapper.getNum();
            if(n<1||n>maxn||m<1||m>maxn||n>m)return ResultBody.error("范围超阈限");
            Sort[] list = new Sort[m-n+1];
            for (int i = n;i <= m;i++){
                list[i-n] = sortMapper.getList(i-1);
            }
            return ResultBody.success(list);
        }catch (Exception e){
            e.printStackTrace();
            return ResultBody.error("查询时间失败");
        }
    }
}
