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
    public static ResultBody success(Object object){
        ResultBody rb =new ResultBody();
        rb.setCode("200");
        rb.setMessage("Ok");
        rb.setResult(object);
        return rb;
    }

    public static ResultBody error(String code,String message){
        ResultBody rb =new ResultBody();
        rb.setCode(code);
        rb.setMessage(message);
        rb.setResult(null);
        return rb;
    }

    public static ResultBody error(String message){
        ResultBody rb =new ResultBody();
        rb.setCode("-1");
        rb.setMessage(message);
        rb.setResult(null);
        return rb;
    }
}
