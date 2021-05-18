package com.ckwyy.config;

import com.ckwyy.aop.Comput;
import com.ckwyy.aop.LogAspect;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by 媛媛 on 2021/5/8.
 *
 * @EnableAspectJAutoProxy: AspectJAutoProxyRegistrar  代理
 * 利用@Import最终注册一个bean org.springframework.aop.config.internalAutoProxyCreator";[AnnotationAwareAspectJAutoProxyCreator]
 * AOP核心后置处理器的创建过程:
 *   internalAutoProxyCreator的注册
    internalAutoProxyCreator的继承关系
    internalAutoProxyCreator创建+初始化过程
            入口refresh()方法
            跟进processor创建+初始化的源码
            internalAutoProxyCreator初始化过程中BeanFactoryAware的作用时机
 *
 * https://www.it610.com/article/1287849248355823616.htm
 */
@Configuration
@EnableAspectJAutoProxy
public class MainConfigAop {
    @Bean
    public Comput comput() {
        return new Comput();
    }

    @Bean
    public LogAspect logAspect() {
        return new LogAspect();
    }
}
