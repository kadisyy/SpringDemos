package com.ckwyy.selector;

import com.ckwyy.bean.Blue;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by 媛媛 on 2021/5/3.
 */
public class MyImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {

    /**
     * @param annotationMetadata 当前类注册信息
     * @param registry           BeanDefinition注册类
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry registry) {
        boolean blue = registry.containsBeanDefinition("com.ckwyy.bean.Color");
        boolean color = registry.containsBeanDefinition("com.ckwyy.bean.Red");
        if (blue && color) {
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Blue.class);
            registry.registerBeanDefinition("blue", rootBeanDefinition);
        }
    }
}
