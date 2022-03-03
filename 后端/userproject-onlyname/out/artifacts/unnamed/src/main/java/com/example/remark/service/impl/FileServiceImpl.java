/*
package com.example.remark1.service.impl;

import com.example.remark1.service.FileService;
import com.example.remark1.utils.ResultBody;
import org.springframework.transaction.annotation.Transactional;



import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Date;
public class FileServiceImpl implements FileService {

    //事物：MySQL中的事务    @Override
    public ResultBody uploadFile(MultipartFile file) {
        try {
            String format = this.path_sdf.format(new Date());

            //随机命名
            String name = fileUtil.getNewRandomFileName(file.getOriginalFilename());

            File imgFolder = new File(fileUtil.getAbsoluteImgRootPath() + format);
            if (!imgFolder.isDirectory()) {
                imgFolder.mkdirs();
            }
            //文件上传到服务器的过程
            file.transferTo(new File(imgFolder, name));
            String cover = fileUtil.getRelativeImgRootPath() + format + name;
            return ResultBody.success("success");
        }catch (Exception e){
            e.printStackTrace();
            return ResultBody.error("我也不知道啥错误");
        }
    }
}
*/