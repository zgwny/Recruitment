package com.recruitment.hr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    /**
     * 打开各个页面
     * @param page
     * @return
     */
    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        return page;
    }
    


}
