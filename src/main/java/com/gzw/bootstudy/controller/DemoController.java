package com.gzw.bootstudy.controller;

import com.gzw.bootstudy.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author 郭志武
 * @Date 2020/4/26 22:58
 * @Version 1.0
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return testService.test();
    }
}
