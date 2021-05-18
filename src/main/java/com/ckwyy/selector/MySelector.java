package com.ckwyy.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by 媛媛 on 2021/5/3.
 */
public class MySelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        return new String[]{"com.ckwyy.bean.Color", "com.ckwyy.bean.Red"};
    }
}
