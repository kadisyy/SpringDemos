//package com.ckwyy.bean.processor;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;
//
///**
// * Created by 媛媛 on 2021/5/12.
// */
//@Component
//public class Process {
//
//    @Value(value = "12")
//    private int age;
//    private String name;
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Process() {
//        System.out.println("Process_Construct0");
//    }
//
//    @PostConstruct
//    public void init() {
//        System.out.println("@PostConstruct0");
//    }
//
//    @PreDestroy
//    public void destory() {
//        System.out.println("@PreDestroy");
//    }
//}
