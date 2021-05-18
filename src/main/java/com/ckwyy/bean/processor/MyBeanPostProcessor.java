//package com.ckwyy.bean.processor;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.config.BeanPostProcessor;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//
///**
// * Created by 媛媛 on 2021/5/3.  将后置处理器加载
// */
//@Component
//public class MyBeanPostProcessor implements BeanPostProcessor {
//
//
//    public MyBeanPostProcessor() {
//        System.out.println("Construct");
//    }
//
//    @PostConstruct
//    public void init() {
//        System.out.println("@PostConstruct");
//    }
//
//    @Override
//    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
//        System.out.println("postProcessBeforeInitialization: beanName = " + o);
//        return o;
//    }
//
//    @Override
//    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
//        System.out.println("postProcessAfterInitialization: beanName = " + o);
//        return o;
//    }
//}
