import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.recruitment.utils.DictionaryUtilsImpl;
import com.recruitment.mapper.DictionaryMapper;
import com.recruitment.pojo.Dictionary;
import com.recruitment.pojo.DictionaryExample;


public class DictionaryTest {
    
   
    @Test
    public void test(){
//        DictionaryMapper mapper = applicationContext.getBean(DictionaryMapper.class);
//        
//        DictionaryExample example = new DictionaryExample();
//        
//        List<Dictionary> dictionaries = mapper.selectByExample(example);
//        
//        for (Dictionary dictionary : dictionaries) {
//            System.out.println(dictionary.getItemvalue());
//        }
//        
        DictionaryUtilsImpl dictionaryUtils = DictionaryUtilsImpl.getInstance();
        
        Dictionary dictionary = dictionaryUtils.dictionary("", "scale");
        
        System.err.println(dictionary.getItemvalue());
    }
}
