package com.ckwyy.config;

import com.ckwyy.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * Created by 媛媛 on 2021/5/3.
 */
// 配置类=配置文件 beans.xml
@Configuration
@ComponentScan(basePackages = "com.ckwyy", excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}), // 指定注解类型
//        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {MyDao.class}),  // 指定具体类
        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
// 自动指定扫描规则
}, useDefaultFilters = false) //指定某一个路径
public class MainConfig {

    @Bean(value = "person")  //id默认是方法名字, 但是@bean设置的名字的优先级更高, 即person > person01
    public Person person01() {
        return new Person(14, "wyy");
    }
}
