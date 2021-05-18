package com.ckwyy;

import com.ckwyy.aop.Comput;
import com.ckwyy.bean.Person;
import com.ckwyy.bean.value.Room;
import com.ckwyy.config.*;
import org.junit.Test;
import org.springframework.beans.factory.Aware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * Created by 媛媛 on 2021/5/3.
 */
public class
SpringTest {

    @Test
    public void  test00(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        classPathXmlApplicationContext.getBean("person");
    }
    @Test
    public void test01() {
        ApplicationContext applicationContext01 = new AnnotationConfigApplicationContext(MainConfigPropertyValues.class);
        String[] beanDefinitionNames = applicationContext01.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        //  Object person = applicationContext01.getBean("person");
//        Object person1 = applicationContext01.getBean("person");
//
//        System.out.println(person == person1);
    }

    /**
     * 按照条件 注册bean  @Conditional
     */

    @Test
    public void test02() {
        ApplicationContext applicationContext01 = new AnnotationConfigApplicationContext(MainConfigPropertyValues.class);

        String[] beanNamesForType = applicationContext01.getBeanNamesForType(Person.class);
        for (String name : beanNamesForType) {
            System.out.println(name);
        }
        Map<String, Person> beansOfType = applicationContext01.getBeansOfType(Person.class);
        System.out.println(beansOfType);
    }

    @Test
    public void test03() {
        printBeans(null);
    }

    @Test
    public void test04() {
        ApplicationContext applicationContext01 = new AnnotationConfigApplicationContext(MainConfigPropertyValues.class);

        Object colorFactoryBean = applicationContext01.getBean("colorFactoryBean");
        System.out.println("class = " + colorFactoryBean.getClass());
    }

    @Test
    public void testLifeCycle() {
        AnnotationConfigApplicationContext applicationContext02 = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);

        System.out.println("容器构造完成......");

        applicationContext02.close();
    }


    @Test
    public void test05() {
        AnnotationConfigApplicationContext applicationContext02 = new AnnotationConfigApplicationContext(MainConfigPropertyValues.class);
        Room room = (Room) applicationContext02.getBean("room");
        System.out.println("==============================");
        System.out.println(room);
        applicationContext02.close();
    }

    @Test
    public void testAware() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigAware.class);
        System.out.println("==============");
        applicationContext.close();
    }

    /**
     * 验证properties文件内容等同于环境变量
     */
    @Test
    public void testEnv() {
        AnnotationConfigApplicationContext applicationContext02 = new AnnotationConfigApplicationContext(MainConfigPropertyValues.class);
        ConfigurableEnvironment environment = applicationContext02.getEnvironment();
        System.out.println(environment.getProperty("addr.china"));
        System.out.println(environment.getProperty("java.library.path"));
    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext01) {
        String[] beanDefinitionNames = applicationContext01.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

    @Test
    public void testAop() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigAop.class);
        Comput comput = (Comput) applicationContext.getBean("comput");
        comput.div(1, 0);
    }

    @Test
    public void testProcessor() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigProcessor.class);
        applicationContext.close();
    }
}
