package com.ckwyy.config;

import com.ckwyy.bean.Color;
import com.ckwyy.bean.ColorFactoryBean;
import com.ckwyy.bean.Person;
import com.ckwyy.condition.LinuxCondition;
import com.ckwyy.condition.WindowsCondition;
import com.ckwyy.selector.MyImportBeanDefinitionRegister;
import com.ckwyy.selector.MySelector;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

/**
 * Created by 媛媛 on 2021/5/3.
 */
@Configurable
@Import({MySelector.class, MyImportBeanDefinitionRegister.class})
public class MainConfig2 {

    /**
     * * @see ConfigurableBeanFactory#SCOPE_PROTOTYPE
     *
     * @return
     * @see ConfigurableBeanFactory#SCOPE_SINGLETON
     * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST
     * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION
     * <p>
     * prototype: 多实例. 每次获取用到该bean的时候,才会调用这个方法, 属于饿汉, 多实例的懒汉模式
     * singleton: 单实例(默认值) : IOC容器启动会调用方法创建bean,并放到ICO容器中, 以后每次获取都是从容器获取(map.get).  饱汉
     * <p>
     * 懒加载: 单实例bean, 默认是容器启动的时候创建, 并初始化, 所以懒加载是启动时候不创建, 使用的时候创建
     */
    //@Scope("prototype") // 单实例的懒汉模式
    @Lazy
    @Bean   //默认是单例模式
    public Person person() {
        System.out.println("给容器添加Person......");
        return new Person(233, "wyy");
    }

    // 如果是windows,注册
    @Conditional({WindowsCondition.class})
    @Bean("bill")
    public Person person01() {
        return new Person(62, "Bill");
    }

    //如果是Linux,注册
    @Conditional({LinuxCondition.class})
    @Bean("linus")
    public Person person02() {
        return new Person(48, "linus");
    }

    /**
     * 容器注册的方式
     * 1. 包扫描. @Component, @Service, @Controller
     * 2. @Bean[导入第三方包]
     */

    @Bean
    public ColorFactoryBean colorFactoryBean() {
        return new ColorFactoryBean();
    }
}
