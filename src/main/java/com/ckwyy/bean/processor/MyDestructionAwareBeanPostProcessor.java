package com.ckwyy.bean.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by 媛媛 on 2021/5/17.
 */
//字面上的意思就是销毁bean后置处理器，什么意思呢？就是销毁bean之前，你还想干嘛。

@Component
public class MyDestructionAwareBeanPostProcessor implements DestructionAwareBeanPostProcessor {

    @Override
    public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "postProcessBeforeDestruction_bean销毁前");
    }

    @Override
    public boolean requiresDestruction(Object bean) {
        //默认是true，也就是需要销毁之前做点什么，会调用postProcessBeforeDestruction
        //如果是false，那么就不会调用
        return true;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "postProcessBeforeInitialization_bean初始化前");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "postProcessAfterInitialization_bean初始化后");
        return bean;
    }
}
