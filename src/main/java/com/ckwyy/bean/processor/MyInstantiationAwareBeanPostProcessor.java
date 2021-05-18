//package com.ckwyy.bean.processor;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.PropertyValues;
//import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
//import org.springframework.stereotype.Component;
//
//import java.beans.PropertyDescriptor;
//
///**
// * Created by 媛媛 on 2021/5/17.
// */
//@Component
//public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
//    @Override
//    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
//        System.out.println(beanName + "InstantiationAwareBeanPostProcessor_bean 实例化之前");
//        return null;
//    }
//
//    @Override
//    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
//        System.out.println(beanName + "InstantiationAwareBeanPostProcessorbean_实例化之后");
//        return true;
//    }
//
//    @Override
//    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
//        System.out.println(beanName + "InstantiationAwareBeanPostProcessor_bean 变量处理");
//        return pvs;
//    }
//
//    @Override
//    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println(beanName + "InstantiationAwareBeanPostProcessor_bean 初始化之前");
//        return bean;
//    }
//
//    @Override
//    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println(beanName + "InstantiationAwareBeanPostProcessor_bean 初始化之后");
//        return bean;
//    }
//}
