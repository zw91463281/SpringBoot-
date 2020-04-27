package com.gzw.bootstudy.initialize;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

/**
 *模拟Springboot初始化器的流程
 * @Author 郭志武
 * @Date 2020/4/26 22:20
 * @Version 1.0
 */
@Order(1)
public class FirstIniyialize implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        //获取环境
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        //自定义一个属性
        Map<String,Object> map = new HashMap<>();
        //模拟放入一些系统属性
        map.put("key1","value1");
        //打包成一个属性
        MapPropertySource mapPropertySource =
                new MapPropertySource("firstIniyialize", map);
        //放入环境的所有属性当中的属性集
        environment.getPropertySources().addLast(mapPropertySource);

        System.out.println("run firstIniyialize");


    }










}
