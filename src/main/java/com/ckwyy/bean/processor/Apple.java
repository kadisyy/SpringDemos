package com.ckwyy.bean.processor;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by 媛媛 on 2021/5/13.
 */
@Component
public class Apple implements InitializingBean {

    @Value("99")
    private int a;

    private String b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Apple(){
        System.out.println("apple_实例化");
    }

    @PostConstruct
    public void init(){
        System.out.println("apple_@PostConstruct");
    }
    public String getB() {
        return b;
    }


    @PreDestroy
    public void destory() {
        System.out.println("apple_@PreDestroy");
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("apple_afterPropertiesSet");
    }
}
