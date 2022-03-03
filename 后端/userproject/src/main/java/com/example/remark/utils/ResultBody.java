package com.example.remark.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultBody {
    private String code;
    private String message;
    private Object result;
//    public static ResultBody successMore(Object object,int num){
//        ResultBody rb =new ResultBody();
//        rb.setCode("200");
//        rb.setMessage("共"+num+"条记录。");
//        rb.setResult(object);
//        return rb;
//    }
    //为多条select服务
    public static ResultBody success(Object object){
        ResultBody rb =new ResultBody();
        rb.setCode("200");
        rb.setMessage("Ok");
        rb.setResult(object);
        return rb;
    }
    //为select服务
    public static ResultBody success5(int number){
        ResultBody rb =new ResultBody();
        rb.setCode("200");
        rb.setMessage("Ok");
        rb.setResult("共"+number+"条查询结果。");
        return rb;
    }
    //为getNum服务
    public static ResultBody success3(int num){
        ResultBody rb =new ResultBody();
        rb.setCode("200");
        rb.setMessage("Ok");
        rb.setResult("你已成功登录"+num+"条。");
        return rb;
    }
    //为inster服务
//    public static ResultBody success2(int num){
//        ResultBody rb =new ResultBody();
//        rb.setCode("200");
//        rb.setMessage("Ok");
//        rb.setResult("共删除"+num+"条。");
//        return rb;
//    }
    //为delete服务
//    public static ResultBody success4(int num){
//        ResultBody rb =new ResultBody();
//        rb.setCode("200");
//        rb.setMessage("Ok");
//        rb.setResult("共修改"+num+"条。");
//        return rb;
//    }

//    public static ResultBody error(String code,String message){
//        ResultBody rb =new ResultBody();
//        rb.setCode(code);
//        rb.setMessage(message);
//        rb.setResult(null);
//        return rb;
//    }

    public static ResultBody error(String message){
        ResultBody rb =new ResultBody();
        rb.setCode("-1");
        rb.setMessage(message);
        rb.setResult(null);
        return rb;
    }

}
