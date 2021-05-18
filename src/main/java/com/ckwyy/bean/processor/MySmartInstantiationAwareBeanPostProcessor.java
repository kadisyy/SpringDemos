package com.ckwyy.bean.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;

/**
 * Created by 媛媛 on 2021/5/17.
 */
// 比InstantiationAwareBeanPostProcessor更加smart, 多了幾個接口
public class MySmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {
    @Override
    public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println(beanName + "SmartInstantiationAwareBeanPostProcessor_predictBeanType");
        return null;
    }

    @Override
    public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
        //说白了就是可以决定用哪个构造器来实例化这个bean
        System.out.println(beanName + "SmartInstantiationAwareBeanPostProcessor_determineCandidateConstructors");
        return new Constructor<?>[0];
    }

    @Override
    public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
        //这个就牛逼了，可以解决循环引用的问题，例如A引用了B，B引用了A，A实例化的时候，需要先实例化B，B实例化的时候又需要去实例化A，当B->实例化A的时候，就会走到这个方法，提前把A的引用暴露出去，这时候B就可以完成实例化，最后A也完成的实例化。
        System.out.println(beanName + "SmartInstantiationAwareBeanPostProcessor_getEarlyBeanReference");
        return null;
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println(beanName + "SmartInstantiationAwareBeanPostProcessor_postProcessBeforeInstantiation");
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "SmartInstantiationAwareBeanPostProcessor_postProcessAfterInstantiation");
        return false;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "SmartInstantiationAwareBeanPostProcessor_postProcessPropertyValues");
        return pvs;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "SmartInstantiationAwareBeanPostProcessor_postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "SmartInstantiationAwareBeanPostProcessor_postProcessAfterInitialization");
        return bean;
    }
}
