package com.ckwyy.config;

import com.ckwyy.bean.Car;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by 媛媛 on 2021/5/3.
 */
@ComponentScan("com.ckwyy.bean")
@Configurable
public class MainConfigOfLifeCycle {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Car cat() {
        return new Car();
    }
}
