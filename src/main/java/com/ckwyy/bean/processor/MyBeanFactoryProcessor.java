//package com.ckwyy.bean.processor;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.MutablePropertyValues;
//import org.springframework.beans.factory.config.BeanDefinition;
//import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
//import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
//import org.springframework.stereotype.Component;
//
///**
// * Created by 媛媛 on 2021/5/16.
// */
//@Component
//public class MyBeanFactoryProcessor implements BeanFactoryPostProcessor {
//    @Override
//    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
////
////        BeanDefinition person = beanFactory.getBeanDefinition("person");
////        MutablePropertyValues personPV = person.getPropertyValues();
////        System.out.println("person 屬性值 = " + personPV.toString());
//
////        if (propertyValues.contains("a")) {
////            propertyValues.add("c", "我是c");
////        }
//
//        BeanDefinition apple = beanFactory.getBeanDefinition("apple");
//        MutablePropertyValues propertyValues = apple.getPropertyValues();
//        System.out.println("apple 屬性值 = " + propertyValues.toString());
//
//        if (propertyValues.contains("a")) {
//            propertyValues.add("c", "我是c");
//        }
//
//        BeanDefinition process = beanFactory.getBeanDefinition("process");
//        MutablePropertyValues processOV = process.getPropertyValues();
//        System.out.println("process 屬性值 = " + processOV.toString());
//
//        if (propertyValues.contains("age")) {
//            propertyValues.add("age", "100");
//        }
//
//        //apple.setScope(BeanDefinition.SCOPE_PROTOTYPE);
//    }
//}
