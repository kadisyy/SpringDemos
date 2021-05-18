package com.ckwyy.config;

import org.springframework.context.annotation.FilterType;
import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * Created by 媛媛 on 2021/5/3.
 */
// 自定义规则
public class MyTypeFilter implements TypeFilter {

    // metadataReader读取当前扫描类信息; metadataReaderFactory获取其他任何类信息
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        Resource resource = metadataReader.getResource();

        String className = classMetadata.getClassName();
        System.out.println(">>>>" + className);
        return false;
    }
}
