package com.ckwyy.bean.value;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by 媛媛 on 2021/5/6.
 */
public class Room {

    //1, 基本数字
    //2. SpEL  #{}
    //3. 取出配置文件的值  ${}    l类似xml     <context:property-placeholder></context:property-placeholder>
    //


    @Value("zhangsan")
    String name;

    @Value("#{23-12}")
    int num;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Value("${addr.china}")
    public String addr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", addr='" + addr + '\'' +
                '}';
    }
}
