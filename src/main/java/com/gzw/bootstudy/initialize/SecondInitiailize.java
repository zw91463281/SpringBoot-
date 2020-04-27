package com.gzw.bootstudy.initialize;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

/**
 * 模拟第二种系统初始化器
 * @Author 郭志武
 * @Date 2020/4/26 23:09
 * @Version 1.0
 */
@Order(2)
public class SecondInitiailize implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        //定义一个环境变量
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        //定义一个属性
        Map<String,Object> map = new HashMap<>();
        //放入系统属性
        map.put("key2","value2");
        //打包成一个资源
        MapPropertySource mapPropertySource = new MapPropertySource("secondInitiailize", map);
        //放入环境变量中的属性集中
        environment.getPropertySources().addLast(mapPropertySource);

        System.out.println("run secondInitiailize ");

    }
}
