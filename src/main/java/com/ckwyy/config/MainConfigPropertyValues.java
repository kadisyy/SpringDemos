package com.ckwyy.config;

import com.ckwyy.bean.value.Room;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by 媛媛 on 2021/5/6.
 */
@PropertySource(value = "classpath:/value.properties")  //读取文件的k.v属性
@Configurable
public class MainConfigPropertyValues {
    @Bean
    public Room room() {
        return new Room();
    }
}
