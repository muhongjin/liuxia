/*
package com.example.remark1.controller;

import com.example.remark1.service.FileService;
import com.example.remark1.utils.ResultBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public class FileController {
    final static int maxSize = 10485760;
    @Autowired
    FileService fileService;
    @PostMapping("/admin/upload")
    public ResultBody uploadFile(@RequestParam("file") MultipartFile file){
        try {
            if (file.isEmpty()){
                return ResultBody.error("上传文件为空");
            }
            //文件上传大小
            if (file.getSize() > maxSize){
                return ResultBody.error("文件必须小于10MB");
            }
            return fileService.uploadFile(file);
        }catch (Exception e){
            e.printStackTrace();
            return ResultBody.error(e.getMessage());
        }
    }
}
*/