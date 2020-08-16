package com.tbh.demo.yss.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import sun.nio.ch.SelectorImpl;

public class TestSelectImport implements ImportSelector {


    /**
     * 返回一个字符串数组 里面包含了需要被spring 容器初始化的类的全路径名
     * @param importingClassMetadata
     * @return
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.luban.config.AppConfig"};
    }
}
