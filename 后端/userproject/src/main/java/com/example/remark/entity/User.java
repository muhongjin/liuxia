package com.example.remark.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//无参构造
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
   private String name;
   private String password;
}
