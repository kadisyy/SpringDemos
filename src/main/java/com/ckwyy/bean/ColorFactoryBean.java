package com.ckwyy.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by 媛媛 on 2021/5/3.
 */
public class ColorFactoryBean implements FactoryBean<Color> {
    // 返回一个color对象
    @Override
    public Color getObject() throws Exception {
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    // 是否单实例: false 每次都会调用getObject方法返回bean
    @Override
    public boolean isSingleton() {
        return false;
    }
}
