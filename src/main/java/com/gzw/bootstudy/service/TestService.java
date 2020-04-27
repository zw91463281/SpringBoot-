package com.gzw.bootstudy.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Author 郭志武
 * @Date 2020/4/26 22:54
 * @Version 1.0
 */
@Component
public class TestService implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public String test(){
        //返回上下文的环境变量的属性
        return applicationContext.getEnvironment().getProperty("key1");
    }
}
