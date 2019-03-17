package com.recruitment.utils;

import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import com.recruitment.mapper.DictionaryMapper;
import com.recruitment.pojo.Dictionary;
import com.recruitment.pojo.DictionaryExample;
import com.recruitment.pojo.DictionaryExample.Criteria;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

    
@Service
public class  DictionaryUtilsImpl implements DictionaryUtils {
//        private static final Logger LOOGER = LoggerFactory.getLogger( DictionaryUtilsImpl .class);
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
//        DictionaryMapper mapper = applicationContext.getBean(DictionaryMapper.class);




        @Autowired
        private DictionaryMapper mapper;

        private static List<Dictionary> dictionaries = null;

        private static  DictionaryUtilsImpl  manager = new  DictionaryUtilsImpl ();

        private DictionaryUtilsImpl () {}

        public static  DictionaryUtilsImpl  getInstance() {
            //判断manager的实例是否为空，如果为空创建一个实例，部不为空返回实例。
            Optional< DictionaryUtilsImpl > optional = Optional.fromNullable(manager);
            if (!optional.isPresent()) {
                return new  DictionaryUtilsImpl ();
            }

            return manager;
        }


       

        /**
         * 获得数据字典中对应group的值
         *
         * @param groupKey 数据字典中的groupKey
         * @return 如果存在这个group,返回这个group中的值,如果不存在返回一个empty List
         */
        public List<Dictionary> dictionaries(String groupValue) {
            List<Dictionary> dictionaries = addDataToMemory(groupValue);

            Optional<List<Dictionary>> optional = Optional.fromNullable(dictionaries);
            if (!optional.isPresent()) {
                dictionaries = new ArrayList<Dictionary>();
            }

            return dictionaries;
        }

        public List<Dictionary> addDataToMemory(String groupValue) {
            DictionaryExample example =  new DictionaryExample();
            Criteria criteria =example.createCriteria();
            criteria.andGroupvalueEqualTo(groupValue);
            List<Dictionary> list = mapper.selectByExample(example);
            return list;
            
        }

        public Dictionary dictionary(String itemKey, String groupValue) {
           
            int key = Integer.parseInt(itemKey);
            List<Dictionary> dictionaries = addDataToMemory(groupValue);

            for (Dictionary dictionary : dictionaries) {
                if (dictionary.getItemkey() == key) {
                    return dictionary;
                }
            }
            return new Dictionary();
        }

   
        public Dictionary dictionaryChange(String groupValue, String itemValue) {
            List<Dictionary> dictionaries = addDataToMemory(groupValue);

            for (Dictionary dictionary : dictionaries) {
                if (dictionary.getGroupvalue().equals(itemValue)) {
                    return dictionary;
                }
            }
            return new Dictionary();
        }



}
