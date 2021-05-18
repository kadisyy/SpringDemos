package com.ckwyy.bean;

import com.ckwyy.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 媛媛 on 2021/5/3.
 */
public class Main {
    public static void main(String[] args) {

        // 使用beans.xml  最原始的方法
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        Person person = (Person) classPathXmlApplicationContext.getBean("person");
//        System.out.println("age = " + person.getAge() + "; name = " + person.getName());


//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
//        Person bean = applicationContext.getBean(Person.class);
//        System.out.println(bean.getAge() + ">>>" + bean.getName());
//
//        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
//        for (String name : beanNamesForType) {
//            System.out.println(name);
//        }

        ApplicationContext applicationContext01 = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = applicationContext01.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
