package com.recruitment.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.recruitment.utils.DictionaryUtilsImpl;
import com.recruitment.pojo.Dictionary;
import com.recruitment.utils.JsonUtils;

@Controller
@RequestMapping("/dictionary")
public class DictionaryConrtroller {
    
    @Autowired
    DictionaryUtilsImpl dictionaryUtils;

    @RequestMapping(value="/get",produces=MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    @ResponseBody
    public String getDictionanry(String groupvalue){
       
        
       List<Dictionary> dictionaries =dictionaryUtils.dictionaries(groupvalue);
       
       String json = JsonUtils.objectToJson(dictionaries);
       return json;
       
    }
    
    
}
