package com.example.remark.controller;

import com.example.remark.service.UserService;
import com.example.remark.utils.ResultBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/v1")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/login")
    public ResultBody existUser(@RequestParam("name") String name,@RequestParam("password") String password){
        return userService.existUser(name,password);}
    @PostMapping("/register")
    public ResultBody addUser(@RequestParam("name") String name,@RequestParam("password") String password){
        return userService.addUser(name,password);
    }
    @GetMapping("admin/name")
    public ResultBody kanNum(@RequestParam("name") String name,@RequestParam("password") String password) {
        return userService.kanNum(name, password);
    }
//    @GetMapping("/admin/user/{userName}")
//    public ResultBody getUser(@PathVariable("userName") String name){
//        return userService.getUser(name);
//    }
//    @DeleteMapping("/admin/user")
//    public ResultBody deleteUser(@RequestParam("name") String name) {
//        return userService.deleteUser(name);
//    }
//    @PutMapping("/admin/user")
//    public ResultBody changeUser(@RequestParam("name") String name,@RequestParam("newName") String newName){
//        return  userService.changeUser(name,newName);
//    }
    @GetMapping("admin/user")//在请求头输入参数
    public ResultBody getNum(@RequestHeader("name") String name) {
        return userService.getNum(name);}
//    @GetMapping("admin/users/{usersName}")
//    public ResultBody getMore(@PathVariable("usersName") String name){
//        return userService.getmore(name);
//
//
//
//    }

   /* @PostMapping("/admin/upload")
    public ResultBody uploadFile(@RequestParam("file")MultipartFile file){
        try {
            if (file.isEmpty()){
                return ResultBody.error("上传文件为空");
            }
            //文件上传大小
            if (file.getSize() > 1){
                return ResultBody.error("文件必须小于10MB");
            }
            return fileService.uploadFile(file);
        }catch (Exception e){
            e.printStackTrace();
            return ResultBody.error(e.getMessage());
        }
    }*/

  }
