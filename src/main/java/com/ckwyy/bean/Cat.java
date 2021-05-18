package com.ckwyy.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * Created by 媛媛 on 2021/5/4.
 */
@Component
public class Cat implements InitializingBean, DisposableBean {

    public Cat() {
        System.out.println("cat constructor......");
    }

    // 容器关闭的时候调用 >close
    @Override
    public void destroy() throws Exception {
        System.out.println("cat destroy......");
    }

    //bean创建完成,属性设置之后执行
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("cat afterPropertiesSet......");
    }
}
