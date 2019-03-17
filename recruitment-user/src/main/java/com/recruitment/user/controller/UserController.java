package com.recruitment.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.recruitment.user.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    
    @RequestMapping("/user/update/password")
    public String updateUser(String oldpassword,String password,HttpServletRequest request){
       if( userService.updateUser(oldpassword, password,request)){
           return "redirect:/";
           
       }else{
           return "redirect:/see_account";
       }
        
       
    }
}
