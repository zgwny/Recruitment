package com.recruitment.sso.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.recruitment.mapper.UserMapper;
import com.recruitment.pojo.RecruitmentResult;
import com.recruitment.sso.service.LoginService;
import com.recruitment.utils.ExceptionUtil;

@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private LoginService loginService;
    
    @RequestMapping("/page/login")
    public String page(){
        return "login";
    }
    
    @RequestMapping(value="/login",method = RequestMethod.POST)
    @ResponseBody
    public RecruitmentResult login(String username,String password,HttpServletRequest request, HttpServletResponse response){
        
        try {
            
            RecruitmentResult result = loginService.login(username, password, request, response);           
            return result;
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return RecruitmentResult.build(500, ExceptionUtil.getStackTrace(e));
            
        }
      }
    
    @RequestMapping("/token/{token}")
    @ResponseBody
    public Object getUserByToken(@PathVariable String token, String callback) {
            try {
                RecruitmentResult result = loginService.getUserByToken(token);
                    //支持jsonp调用
                    if (StringUtils.isNotBlank(callback)) {
                            MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
                            mappingJacksonValue.setJsonpFunction(callback);
                            return mappingJacksonValue;
                    }
                    return result;
                    
            } catch (Exception e) {
                    e.printStackTrace();
                    return RecruitmentResult.build(500, ExceptionUtil.getStackTrace(e));
            }
    }

}
